# WebServicesREST

## Projet

Test de mise en place de webservice sous REST 

## Pré-requis
* java jdk 8
* tomcat version 9

## Déploiement du webservice

1. Vérifier si le fichier demorestfullws.war est bien présent dans le dossier. (build => demorestfullws.war)
5. Ouvrir un navigateur
6. Ce rendre sur la page pour déployer un war sur tomcat :(si installer en local [tomcat](http://localhost:8080/manager/html))
7. S'authentifier
8. Trouver la section "Fichier WAR à déployer"
9. Cliquer sur "Choisir un fichier" et séléctionner le fichier demorestfullws.war
10. Cliquer sur déployer
11. Vérifier que webservice est présent dans la liste des applications déployer

## Test de l'application 
1. Ouvrir un navigateur de votre choix
2. Se rendre à l'url [Page d'accueil](http://localhost:8080/demorestfullws/)
3. Test de la méthode get + params : [Page get + params](http://localhost:8080/demorestfullws/rest/hello/Allan) ou cliquer sur le lien de page d'accueil 
4. Pour valider voir à l'écran : Jersey repond via OBJIS : Allan
5. Pour tester la méthode get sans params sur /hello ce rendre sur : [Page get + params](http://localhost:8080/demorestfullws/rest/hello) 
6. Pour valider le test voir bienvenue Ensup
7. Pour tester la méthode post revenir sur la page d'accueil [Page post](http://localhost:8080/demorestfullws/) et remplir le formulaire et le valider
8. Pour vérifier la méthode post vous devrez arriver sur une page avec ce que vous avais saisie dans le formulaire.

