package hn.edu.ujcv.pdm_2021_ii_p1_l1

class MenuPrincipal {
    fun mostrarMenu(){
        println("Menu Principal")
        println("1. Cobrar ENEE")
        println("2. Cobrar SANAA")
        println("3. Salir")
    }
    fun procesarMenu(opcion:Int){
        do{
            val opcion:Int?
            mostrarMenu()
            opcion = readLine().toString().toInt()
            if(opcion==3){
                println("Gracias por usar el programa")
            }
            if(opcion==4){

            }
            when(opcion){

            }
        }while(opcion!=3)
    }
}
