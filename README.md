# WebServicesREST

## Projet

Test de mise en place de webservice sous REST 

## Pré-requis
java jdk 8
maven 3.8.4
tomcat 9
postman

## Création et déployement du webservice

### Création et démarrage du webservice
1. Ouvrir un terminal à la racine du dossier
2. Générer le war du webservice : ```mvn clean package```
3. Vérifier si le fichier restfullexample.war a été créé dans le dossier : target => restfullexample.war
4. Ouvrir un navigateur
5. Se rendre sur la page pour déployer un war sur tomcat :(si installer en local [tomcat](http://localhost:8080/manager/html))
6. S'authentifier
7. Trouver la section "Fichier WAR à déployer"
8. Cliquer sur "Choisir un fichier" et sélectionner le fichier restfullexample.war
9. Cliquer sur déployer
10. Vérifier que webservice est présent dans la liste des applications déployer


### Tester le webservice
1. Ouvrir un navigateur
2. ce rendre sur l'endpoint get de l'application[get Mettalica](http://localhost:8080/restfulexample/rest/json/metallica/get)
3. Vous deviez avoir : {"singer":"Metallica","title":"Enter Sandman"} 
Pour tester le deuxième endpoint
4. Ouvrir postman
5. Aller sur File/New
6. Cliquer sur httpRequest
7. Remplir comme ci-dessous 
[](https://github.com/asemin08/WebServicesREST/blob/tp9/imgs/methodGet.png)
8. Remplir comme ci-dessous
[](https://github.com/asemin08/WebServicesREST/\imgs\Méthode.png)
10. Cliquer sur send pour exécuter la requete


## liste des projet

Nom du projet | Description | Lien
---|---|----
tp7 | Test de mise en place de webservice sous REST | [tp7](https://github.com/asemin08/WebServicesREST/tree/tp7)
tp8 | Passage Objet vers JSON avec Jackson| [tp8](https://github.com/asemin08/WebServicesREST/tree/tp8)
tp9 | création d'un WebService JAX-RS 1 avec Jersey / Jackson | [tp9](https://github.com/asemin08/WebServicesREST/tree/tp9)
