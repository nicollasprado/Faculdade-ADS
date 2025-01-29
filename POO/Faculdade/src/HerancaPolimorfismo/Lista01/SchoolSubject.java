package HerancaPolimorfismo.Lista01;

public class SchoolSubject {
    private String name;
    private Double gradeFirstBimester;
    private Double gradeSecondBimester;
    private Double finalGrade;
    private Double parcialGrade;
    private double weightFirstBimester = 2.0;
    private double weightSecondBimester = 3.0;
    private double subjectAverage = 60;
    private double finalAverage;
    private double[] gradeRange = {0, 100};
    private boolean approved = false;

    public SchoolSubject(String name){
        this.name = name;
    }

    public SchoolSubject(String name, Double gradeFirstBimester) throws IllegalArgumentException {
        if(gradeFirstBimester > this.gradeRange[1] || gradeFirstBimester < this.gradeRange[0]){
            throw new IllegalArgumentException("Nota inválida");
        }else{
            this.name = name;
            this.gradeFirstBimester = gradeFirstBimester;
        }
    }

    public SchoolSubject(String name, Double gradeFirstBimester, Double gradeSecondBimester) throws IllegalArgumentException {
        if(gradeFirstBimester > this.gradeRange[1] || gradeFirstBimester < this.gradeRange[0] || gradeSecondBimester > this.gradeRange[1] || gradeSecondBimester < this.gradeRange[0]){
            throw new IllegalArgumentException("Nota inválida");
        }else{
            this.name = name;
            this.gradeFirstBimester = gradeFirstBimester;
            this.gradeSecondBimester = gradeSecondBimester;
        }
    }

    public SchoolSubject(String name, Double gradeFirstBimester, Double gradeSecondBimester, Double finalGrade) throws IllegalArgumentException {
        if(gradeFirstBimester > this.gradeRange[1] || gradeFirstBimester < this.gradeRange[0] || gradeSecondBimester > this.gradeRange[1] || gradeSecondBimester < this.gradeRange[0] || finalGrade > this.gradeRange[1] || finalGrade < this.gradeRange[0]){
            throw new IllegalArgumentException("Nota inválida");
        }else{
            this.name = name;
            this.gradeFirstBimester = gradeFirstBimester;
            this.gradeSecondBimester = gradeSecondBimester;
            this.finalGrade = finalGrade;
        }
    }

    public SchoolSubject(String name, Double gradeFirstBimester, Double gradeSecondBimester, Double finalGrade, double weightFirstBimester, double weightSecondBimester) throws IllegalArgumentException {
        if(gradeFirstBimester > this.gradeRange[1] || gradeFirstBimester < this.gradeRange[0] || gradeSecondBimester > this.gradeRange[1] || gradeSecondBimester < this.gradeRange[0] || finalGrade > this.gradeRange[1] || finalGrade < this.gradeRange[0]){
            throw new IllegalArgumentException("Nota inválida");
        }else{
            this.name = name;
            this.gradeFirstBimester = gradeFirstBimester;
            this.gradeSecondBimester = gradeSecondBimester;
            this.finalGrade = finalGrade;
            this.weightFirstBimester = weightFirstBimester;
            this.weightSecondBimester = weightSecondBimester;
        }
    }

    public SchoolSubject(String name, Double gradeFirstBimester, Double gradeSecondBimester, Double finalGrade, double weightFirstBimester, double weightSecondBimester, double[] gradeRange) throws IllegalArgumentException {
        if(gradeFirstBimester > this.gradeRange[1] || gradeFirstBimester < this.gradeRange[0] || gradeSecondBimester > this.gradeRange[1] || gradeSecondBimester < this.gradeRange[0] || finalGrade > this.gradeRange[1] || finalGrade < this.gradeRange[0]){
            throw new IllegalArgumentException("Nota inválida");
        }else if(gradeRange.length > 2){
            throw new IllegalArgumentException("Valores minimos e máximos inválidos");
        }else{
            this.name = name;
            this.gradeFirstBimester = gradeFirstBimester;
            this.gradeSecondBimester = gradeSecondBimester;
            this.finalGrade = finalGrade;
            this.weightFirstBimester = weightFirstBimester;
            this.weightSecondBimester = weightSecondBimester;
            this.gradeRange = gradeRange;
        }
    }

    public SchoolSubject(String name, Double gradeFirstBimester, Double gradeSecondBimester, Double finalGrade, double weightFirstBimester, double weightSecondBimester, double[] gradeRange, double subjectAverage) throws IllegalArgumentException {
        if(gradeFirstBimester > this.gradeRange[1] || gradeFirstBimester < this.gradeRange[0] || gradeSecondBimester > this.gradeRange[1] || gradeSecondBimester < this.gradeRange[0] || finalGrade > this.gradeRange[1] || finalGrade < this.gradeRange[0]){
            throw new IllegalArgumentException("Nota inválida");
        }else if(gradeRange.length > 2){
            throw new IllegalArgumentException("Valores minimos e máximos inválidos");
        }else{
            this.name = name;
            this.gradeFirstBimester = gradeFirstBimester;
            this.gradeSecondBimester = gradeSecondBimester;
            this.finalGrade = finalGrade;
            this.weightFirstBimester = weightFirstBimester;
            this.weightSecondBimester = weightSecondBimester;
            this.gradeRange = gradeRange;
            this.subjectAverage = subjectAverage;
        }
    }


    public Double parcialGrade(){
        if(gradeFirstBimester == null || gradeSecondBimester == null){
            throw new IllegalArgumentException("Notas do primeiro e/ou segundo bimestre não registradas!");
        }else{
            parcialGrade = ((gradeFirstBimester * weightFirstBimester) + (gradeSecondBimester * weightSecondBimester)) / (weightFirstBimester * weightSecondBimester);
            if(parcialGrade >= subjectAverage){
                approved = true;
            }
            return parcialGrade;
        }
    }

    public double finalAverage() throws IllegalArgumentException {
        if(approved){
            throw new IllegalArgumentException("O aluno já está aprovado");
        }else if(parcialGrade == null){
            throw new IllegalArgumentException("O aluno ainda não tem média parcial");
        }else if(finalGrade == null){
            throw new IllegalArgumentException("Nota final não definida");
        }else{
            finalAverage = (parcialGrade + finalGrade) / 2;
            if(finalAverage > subjectAverage){
                approved = true;
            }
            return finalAverage;
        }
    }






    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGradeFirstBimester() {
        return gradeFirstBimester;
    }

    public void setGradeFirstBimester(Double gradeFirstBimester) {
        this.gradeFirstBimester = gradeFirstBimester;
    }

    public double getGradeSecondBimester() {
        return gradeSecondBimester;
    }

    public void setGradeSecondBimester(Double gradeSecondBimester) {
        this.gradeSecondBimester = gradeSecondBimester;
    }

    public double getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(Double finalGrade) {
        this.finalGrade = finalGrade;
    }

    public double getWeightFirstBimester() {
        return weightFirstBimester;
    }

    public void setWeightFirstBimester(double weightFirstBimester) {
        this.weightFirstBimester = weightFirstBimester;
    }

    public double getWeightSecondBimester() {
        return weightSecondBimester;
    }

    public void setWeightSecondBimester(double weightSecondBimester) {
        this.weightSecondBimester = weightSecondBimester;
    }

    public double getSubjectAverage() {
        return subjectAverage;
    }

    public void setSubjectAverage(double subjectAverage) {
        this.subjectAverage = subjectAverage;
    }

    public double[] getGradeRange() {
        return gradeRange;
    }

    public void setGradeRange(double[] gradeRange) {
        this.gradeRange = gradeRange;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public double getParcialGrade() {
        return parcialGrade;
    }

    public void setParcialGrade(Double parcialGrade) {
        this.parcialGrade = parcialGrade;
    }

    public double getFinalAverage() {
        return finalAverage;
    }

    public void setFinalAverage(double finalAverage) {
        this.finalAverage = finalAverage;
    }
}
