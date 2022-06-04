# Instant System technical test 
 

L'exercice consiste à créer une RestFul Api pour afficher à un endpoint mobile et web une liste des parkings et leurs états en temps réel. 
Le temps passé sur le teste est de 6h et demi. La majorité de temps passait en essayant de comprendre comment bien utiliser l'API.

Le document contiendra :

- Explication de réflexion et de choix.
- Explication de l'architecture .
- Difficultés.
- S'il y avait plus de temps.


## Explication de réflexion et de choix :
 - Comment consommer les données : 
    D'abord j'ai pensé à utiliser une base de données MongoDB et la remplir manuellement. J'ai pensé à cela car j'ai pensé que les données sont juste un échantillon et vous avez une base de données spéciale à vous.
    J'ai utilisé MongoDB car les données ne respectent pas une forme spécifique ( colonnes) et du coup c'est plus évident d'utiliser une base de données noSQL.
    J'ai pu penser à utiliser une base de données relationelle en faisant une table contenant, et les info de parking et les données en temps réel, les élements non obligatoire seront nullables.
   Après une reflexion, j'ai décidé de consommer les données directement, et jouer sur les paramètres que l'on donne à l'api pour changer la ville et les outputs.
 -  Afin d'utiliser l'API dans differentes villes, je pensais à passer le nom de la ville en parametres et passer le parametres à la source de données. Ce paramètre sera deployé avec l'application mobile ou web comme constante.  
## Explication de l'architecture :

Je vous explique les differents packages et les composants Java utilisés. Architecture MVC Utilisé.

| Composant | Explications |
| ------ | ------ |
| Model | Package contenant les modèles de l'app. Des classes POJO générées depuis le site quickType. |
| Controller | Package de controllers, contient les differents endpoint. |
| Repository | Contient les interfaces que l'on puisse afficher au user |
| Provider  | Ici se passe le process de data afin de retourner un object de Model|

## Difficultés :
 Au cours de réflexion, j'ai rencontré differents difficultés. 
 - 1- Savoir comment consommer les données et quels choix faire pour modéler la données.
 - 2- Après avoir choisi de consommer directement depuis l'api, comment faire la conception de code afin de mettre en premier lieu mes connaissances. 
 - 3- Faire une jointure entre les  deux dataset. Alors j'ai décidé d'afficher directement les données de temps réels, car elles contiennent toutes les informations nécessaires pour les endpoints.
## Choses bizzares  :
 - 1- Les noms de colonnes depuis l'api ne correspendent pas à la convention java (lowCamelCase). Et du coup j'étais obligé de briser les conventions.
 - 2- Trop de données que je n'ai pas compris dans l'api. J'ai essayé d'utiliser la colonne "records" seulement.
 
## S'il y avait plus de temps : 
 - 1- Connaitre les bases de unit tests et les implémenter. ( Je vais les faires comme même, pour pratiquer)
 - 2- Nommer les variables par les conventions JAVA et faire la sérialisation manuellement.
 - 3- Faire une jointure entre les informations de parking et les informations en temps réel ( par Id  ou geoPoint) afin de livrer aux endpoints un maximum de données. ( les données non disponibles seront à null).
 - 4- Utiliser Lombok. ( J'ai essayé de le faire , les accesseurs ne sont pas générés)
 - 5- Livrer une autre version contenant les données depuis une base de données propres à vous. Cela me permettra de faire une meilleure architecture, en utilisant les dao et les fonctions prédifinies dans l'interface JPA.