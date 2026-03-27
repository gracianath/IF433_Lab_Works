package oop_116931_GraciaNathania.week07

fun processEvent(event: BattleState){
    when(event){
       is BattleState.SafeZone -> {
           println("Anda berada di zona aman.")
       }

        is BattleState.MonsterEncounter -> {
            println("Monster ${event.monsterName} muncul! Bersiap bertarung.")
        }

        is BattleState.LootDropped -> {
            val (name, damage, rarity) = event.item
            println("Mendapat loot: $name | Damage: $damage | Rarity: $rarity")
        }

        is BattleState.GameOver -> {
            println("Game Over! Alasan: ${event.reason}")
        }
    }
}