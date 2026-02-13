package oop_116931_GraciaNathania.week02
import java.util.Scanner

class Hero(val name: String, var baseDamage: Int, var hp: Int = 100){
    fun attack(targetName: String){
        println("$name menebas $targetName!")
    }

    fun takeDamage(damage: Int){
        hp -= damage
        if(hp <= 0){
            hp = 0
        }
    }

    fun isAlive(): Boolean{
        return hp > 0
    }
}

fun main(){
    val scanner = Scanner(System.`in`)

    println("Masukkan nama Hero: ")
    val hero = scanner.nextLine()

    println("Masukkan stat damage: ")
    val damage = scanner.nextInt()

    val hero1 = Hero(hero, damage)

    var enemyHP = 100

    while (hero1.isAlive() && enemyHP > 0) {
        println("--- MENU ---")
        println("Menu: 1. Serang, 2. Kabur")
        println("Pilih menu: ")
        var choice = scanner.nextInt()
        if (choice == 1){
            hero1.attack(hero)
            enemyHP -= hero1.baseDamage
            if (enemyHP < 0){
                enemyHP = 0
            }
            println("sisa HP musuh ${enemyHP}")

            if(enemyHP > 0){
                println("Musuh membalas!")
                hero1.takeDamage((10..20).random())
                println("sisa HP hero kamu: ${hero1.hp}")
            }

        }
        if(choice == 2){
            println("hero kaburrr")
            break
        }
    }
    println("Hasil pertandingan")
    if(hero1.isAlive() && enemyHP <= 0){
        println("kamu menang!")
    }else if(enemyHP > hero1.hp){
        println("kamu kalah!")
    }
}