# WebServicesREST

## Projet

Test de mise en place de webservice sous REST 

## Pré-requis
java jdk 8
maven 3.8.4
tomcat 9

### Création et démarrage du webservice
1. Ouvrir un terminal à la racine du dossier
2. Générer le war du webservice : ```mvn clean package```
3. Vérifier si le fichier monwebservicerest.war a été créé dans le dossier : target => monwebservicerest.war
4. Ouvrir un navigateur
5. Se rendre sur la page pour déployer un war sur tomcat :(si installer en local [tomcat](http://localhost:8080/manager/html))
6. S'authentifier
7. Trouver la section "Fichier WAR à déployer"
8. Cliquer sur "Choisir un fichier" et sélectionner le fichier monwebservicerest.war
9. Cliquer sur déployer
10. Vérifier que webservice est présent dans la liste des applications déployer


### Tester le webservice
1. Ouvrir un navigateur
2. ce rendre sur l'endpoint get de l'application[hello jersey](http://localhost:8080/monwebservicerest/rest/message)
3. Vous deviez avoir : Hello World !! - Jersey 2

## liste des projet

Nom du projet | Description | Lien
---|---|----
JerseyFirstTest | Premier WS avec Jersey et déployer sur un serveur tomcat avec un appel get + get et params et post methods| [testJersey](https://github.com/asemin08/WebServicesREST/tree/testJersey)
tp8 | Passage Objet vers JSON avec Jackson| [tp8](https://github.com/asemin08/WebServicesREST/tree/tp8)
tp9 | création d'un WebService JAX-RS 1 avec Jersey / Jackson | [tp9](https://github.com/asemin08/WebServicesREST/tree/tp9)
tp10 |création d'un WebService JAX-RS 2 avec Jersey | [tp10](https://github.com/asemin08/WebServicesREST/tree/tp10)
