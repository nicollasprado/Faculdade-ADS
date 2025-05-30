package com.nicollasprado.utils;

import com.nicollasprado.Exceptions.EntityIdNotFoundException;
import com.nicollasprado.annotations.Column;
import com.nicollasprado.annotations.Entity;
import com.nicollasprado.annotations.Id;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AnnotationHandler {

    public static Field getIdField(Class<?> target){
        for(Field field : target.getDeclaredFields()){
            if(field.isAnnotationPresent(Id.class)){
                return field;
            }
        }

        throw new EntityIdNotFoundException(target.getSimpleName());
    }

    public static String getEntityName(Class<?> entity){
        if(!entity.isAnnotationPresent(Entity.class)){
            throw new IllegalArgumentException(entity.getSimpleName() + " class don't have @entity annotation.");
        }

        String entityName = entity.getAnnotation(Entity.class).name();
        if(entityName.isEmpty()){
            entityName = entity.getSimpleName().toLowerCase();
        }

        return entityName;
    }

    public static List<Field> getColumnFields(Class<?> entity){
        return Arrays.stream(entity.getDeclaredFields())
                .filter(field -> field.isAnnotationPresent(Column.class) || field.isAnnotationPresent(Id.class))
                .collect(Collectors.toList());
    }

    // not null, unique...
    public static String getColumnDetails(Field field){
        if(!field.isAnnotationPresent(Column.class) && !field.isAnnotationPresent(Id.class)){
            throw new IllegalArgumentException("Error retrieving field details: Field don't have @Column annotation.");
        }

        StringBuilder details = new StringBuilder();

        Column fieldAnnotation = field.getAnnotation(Column.class);

        // if it isn't ID field
        if(fieldAnnotation != null){
            if(!fieldAnnotation.nullable()){
                details.append("NOT NULL ");
            }
            if(fieldAnnotation.unique()){
                details.append("UNIQUE ");
            }
        }

        if(field.isAnnotationPresent(Id.class) ){
            if(details.toString().contains("UNIQUE")){
                details.append("PRIMARY KEY ");
            }else{
                details.append("UNIQUE PRIMARY KEY ");
            }

            switch (field.getAnnotation(Id.class).strategy()){
                case AUTO_INCREMENT -> details.append("GENERATED ALWAYS AS IDENTITY ");
                case UUID -> details.append("DEFAULT uuid_generate_v4() ");
            }
        }

        return details.toString();
    }
}
