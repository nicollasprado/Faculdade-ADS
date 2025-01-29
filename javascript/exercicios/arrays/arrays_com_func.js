let valores = [2, 4];

const func = [
    (val)=>{
        let res = 0;
        for(v of val) {
            res+=v
        }
        return res
    },
    (val)=>{
        let res = 1
        for(v of val) {
            res*=v
        }
        return res
    },
    (val)=>{
        for(v of val) {
            console.log(v)
        }
    }
]

console.log(`A soma dos valores ${valores[0]} e ${valores[1]} é ${func[0](valores)}`)
console.log('')
console.log(`A multiplicação dos valores ${valores[0]} e ${valores[1]} é ${func[1](valores)}`)
console.log('')
func[2](valores)