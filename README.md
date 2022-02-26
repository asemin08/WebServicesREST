# WebServicesREST

## Projet

Mise en place d'un webservice rest avec JAX-RS 1 avec Jersey / Jackson

## Pré-requis
* java jdk 8
* maven 3.8.4
* tomcat 9
* postman

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
2. ce rendre sur l'endpoint get de l'application[get Mettalica](http://localhost:8080/restfullexample/rest/json/metallica/get)
3. Vous deviez avoir : {"singer":"Metallica","title":"Enter Sandman"} 
Pour tester le deuxième endpoint
4. Ouvrir postman
5. Aller sur File/New
6. Cliquer sur httpRequest
7. Remplir comme ci-dessous 
![methodPost-1](https://github.com/asemin08/WebServicesREST/blob/tp9/MethodPost-1.png)
</br>8. Remplir comme ci-dessous
![methodPost-2](https://github.com/asemin08/WebServicesREST/blob/tp9/MethodPost-2.png)
8. Cliquer sur send pour exécuter la requete
9. Avoir le résultat ci-dessous
![methodPost-2](https://github.com/asemin08/WebServicesREST/blob/tp9/MethodPost-3.png)

## Documentation
1. Ouvrir un navigateur
2. Ce rendre sur : [doc](http://localhost:8080/restfullexample/swagger-ui/index.html)

## liste des projet

Nom du projet | Description | Lien
---|---|----
tp7 | Premier WS avec Jersey et déployer sur un serveur tomcat avec un appel get + get et params et post methods| [tp7](https://github.com/asemin08/WebServicesREST/tree/testJersey)
tp8 | Passage Objet vers JSON avec Jackson| [tp8](https://github.com/asemin08/WebServicesREST/tree/tp8)
tp9 | création d'un WebService JAX-RS 1 avec Jersey / Jackson | [tp9](https://github.com/asemin08/WebServicesREST/tree/tp9)
tp10 |création d'un WebService JAX-RS 2 avec Jersey | [tp10](https://github.com/asemin08/WebServicesREST/tree/tp10)
tp11 | Client Web Service JAX-RS 1 | [tp11](https://github.com/asemin08/WebServicesREST/tree/tp11)
tp12 | Client Web Service JAX-RS 2 | [tp11](https://github.com/asemin08/WebServicesREST/tree/tp12)
tp13 | Intégration SOAP et REST | [tp13](https://github.com/MaximeDzN/trackSoapRest)
tp14 | Documentation Web Service REST | [tp14](https://github.com/asemin08/WebServicesREST/tree/tp14)
