# Практическая задача 3.1.5 Java pre-project. Задача 3.3. Rest controllers.
Практическая задача
Задание:
1. Написать Rest-контроллеры для вашего приложения.
2. Переписать вывод (заполнение) таблицы, модальных окон и т.д. на JS c помощью Fetch API, допускается использование JQuery.
3. При любых изменениях данных страница приложения не должна перезагружаться!
##
- config
    - [SecurityConfig](src/main/java/com/example/spring_boot_rest_js/config/SecurityConfig.java)
    - [SuccessUserHandler](src/main/java/com/example/spring_boot_rest_js/config/SuccessUserHandler.java)
- controller
    - rest
        - [AdminRestController](src/main/java/com/example/spring_boot_rest_js/controller/rest/AdminRestController.java)
        - [UserRestController](src/main/java/com/example/spring_boot_rest_js/controller/rest/UserRestController.java)
    - [ViewController](src/main/java/com/example/spring_boot_rest_js/controller/ViewController.java)
- entity
    - [Role](src/main/java/com/example/spring_boot_rest_js/entity/Role.java)
    - [User](src/main/java/com/example/spring_boot_rest_js/entity/User.java)
- repository
    - impl
        - [RoleRepositoryImpl](src/main/java/com/example/spring_boot_rest_js/repository/impl/RoleRepositoryImpl.java)
        - [UserRepositoryImpl](src/main/java/com/example/spring_boot_rest_js/repository/impl/UserRepositoryImpl.java)
    - [RoleRepository](src/main/java/com/example/spring_boot_rest_js/repository/RoleRepository.java)
    - [UserRepository](src/main/java/com/example/spring_boot_rest_js/repository/UserRepository.java)
- service
    - impl
        - [RoleServiceImpl](src/main/java/com/example/spring_boot_rest_js/service/impl/RoleServiceImpl.java)
        - [UserServiceImpl](src/main/java/com/example/spring_boot_rest_js/service/impl/UserServiceImpl.java)
    - [RoleService](src/main/java/com/example/spring_boot_rest_js/service/RoleService.java)
    - [UserService](src/main/java/com/example/spring_boot_rest_js/service/UserService.java)
- [SpringBootRestJsApplication](src/main/java/com/example/spring_boot_rest_js/SpringBootRestJsApplication.java)
- resources
    - static
        - [admin.js](src/main/resources/static/admin.js)
        - [user.js](src/main/resources/static/user.js)
    - template
        - [admin.html](src/main/resources/templates/admin.html)
        - [user.html](src/main/resources/templates/user.html)
        - [login.html](src/main/resources/templates/login.html)
    - [application.properties](src/main/resources/application.properties)
    - [data.sql](src/main/resources/data.sql)


Тестовые логин и пароль:
admin@gmail.com : admin
user@gmail.com : user
    