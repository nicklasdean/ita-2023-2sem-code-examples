package com.example.examples.inheritance.users

fun main() {
    val basicUserExample : BasicUser = BasicUser("nifr","password123");
    val basicUserExample2 : BasicUser = BasicUser("behu","password123");
    val basicUserExample3 : BasicUser = BasicUser("bob","password123");

    val adminUser1 : AdminUser = AdminUser("admin-nifr","123","ni@email.com");
    val adminUser2 : AdminUser = AdminUser("admin-alice","1236","ni@email.com");

    val listOfBasicUsers : List<User> = listOf(adminUser1,basicUserExample,basicUserExample2);

    for(user: User in listOfBasicUsers){
        user.identifyYourself();
    }

}