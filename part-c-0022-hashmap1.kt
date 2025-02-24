fun main() {
    
    val salaries = HashMap<String, Int>()
    
    salaries.put("ayhan", 3000)
    salaries.put("bilge", 3600)
    salaries.put("kağan", 4200)
    salaries.put("hakan", 4000)
    
	salaries.remove("hakan")
    
	println(salaries["bilge"]) // 3600
    
}

