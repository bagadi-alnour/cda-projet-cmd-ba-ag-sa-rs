# cda-projet-cmd team Couching 


tp simulateur ligne de commande :
*********************************
Créer un nouveau repos GIT , nommé cda-projet-cmd-initial1-initial2 
et y ajouter le formateur en tant que dev (droit d ecriture)
votre repos Git doit contenir :
- un repertoire projet java cmd-project : votre projet eclipse
- un repertoire document contenant : 
-- un fichier team.txt : fichier contenant les noms des membres de l'équipe.
-- un fichier trello.txt : contenant le lien de l'espace trello avec les taches attribuées
 à chaque personnes. Invitez le formateur à cet espace.
Donnez le nom cda-projet-cmd-initial1-initial2 à votre espace trello.
n'oubliez pas les initiales s'il vous plaît
Dans trello, créez au moins 3 listes de taches ( 3 colonnes )
--à faire : toutes les taches que vous relevez, faisable de façon individuelle
--en cours : les taches entrain d'être réalisées, la personne qui le fait doit se l'attribuer dans trello
--terminées : les taches terminées
au minimums ces 3 listes (ne changez pas si c'est déjà fait en anglais, todo ...)
si vous voulez en ajoutez d'autres, c'est possible
au niveau du formatage du texte et des messages, vous pouvez proposez ce que vous voulez
ce tp consiste à créer une application qui va implémenter plusieurs commandes 
pour simuler un terminal ou une console :
créer un programme qui demande de saisir une commande
si la commande est égale à "help" afficher le message "Bonjour sur la console cda"
si la commande est égale à "exit" , le programme s'arrête.
si la commande est égale à "pwd" , afficher le message "Commande pas encore implémentée"
sinon , le message "Commande introuvable" est affiché
tant que l'utilisateur n'a pas saisi la commande exit, il peut toujours saisir une commande
!!!!! cet émulateur de commande n'est pas sensible à la casse !!!!
!!!!! Help et hElP donnent le même résultat !!!!
-   La commande "Help" doit afficher une description pour chaque commande
-   ajouter la commande "river" qui prend 2 paramètres en entrée et  
    affiche la première intersection des rivières obtenues pour ces paramètres.
    > river 57 78
    111
-   ajouter la commande "isprime" qui prend en paramètre un entier et affiche yes si ce paramètre est un nombre premier no sinon
    > isprime 13
    yes
    > isprime 44
    no
-   ajouter la commande "history" si la commande est égale à history ,
    le programme affiche la liste des 10 dernières commandes ( sans la commande history ).
    Cette commande affiche ,en plus de la commande, les paramètres passés à la commande 
    et la date de l’exécution de la commande avec ce format 11:40:22 03/10/2025.
-   ajouter la nouvelle commande "histclear" qui vide/purge l'historique des commandes , et n'affiche rien
-   ajouter une nouvelle commande "quit" : si je tape "quit" le programme s’arrête.
-   ajouter la nouvelle commande "dir" qui affiche le contenu du répertoire  c:\ dans un premier temps.
    un élément par ligne précédé par <DIR> si l'élément est un répertoire  
    et de plusieurs espaces si c'est un fichier.
    la commande dir doit au final afficher toust le contenu du repertoire en cours.
-   ajouter la commande "dirng", commande dir nouvelle génération, qui m'affiche le contenu
    du répertoire  en cours,exactement comme la commande dir, mais en plus m'affiche le nombre de
    répertoires et le nombre de fichier.
    exemple:
    > dirng
    <DIR>          DRIVERS
                   d-fichier.txt
    <DIR>          PerfLogs
    <DIR>          Program Files
    <DIR>          Program Files (x86)
    <DIR>          temp
    <DIR>          Users
    <DIR>          Windows
    3 fichiers
    19 répertoires
-   ajouter la commande "CD" qui permet de se déplacer dans un répertoire qui existe dans le dossier en cours.
    le dossier en cours est la racine par défaut : c:\
    pour remonter dans le dossier parent utiliser ".." comme paramètre.
    la commande pwd est impacté !!! pwd affiche le dossier courant !!
    les commandes dir et dirng sont aussi impactées
    exemple :
    > pwd 
    C:\
    > dir
    <DIR> temp
    > cd temp
    > pwd
    c:\temp
    > dir
    <DIR> d1
    <DIR> d2
    > cd ..
    > pwd
    c:\
    > cd blibli
    Le chemin d’accès spécifié est introuvable.
    > cd .
    > pwd
    c:\ 
-   mise en place de la récursivité : ajouter la commande "find", qui fonctionne de façon récursive 
    et qui a 2 options -starts -ends , 
    si >find -ends tata
       liste tous les fichiers dans le répertoire en cours et sous répertoires dont le nom termine par la chaine tata avec le nombre de ces fichiers
    si >find -starts toto
       liste tous les fichiers dans le répertoire en cours et sous répertoires dont le nom commence par la chaine toto avec le nombre de ces fichiers
    si > find titi 
        liste tous les fichiers dans le répertoire en cours et sous répertoires est la chaîne titi avec le nombre de ces fichiers
    sinon affiche un message "ajouter un paramètre ..."
    si > find -starts tata -ends toto
    liste tous les fichiers dans le répertoire en cours et sous répertoires dont le nom commence par la chaîne tata
    et termine par la chaîne toto avec le nombre de ces fichiers
    si le répertoire actuel est c:\chemin\
    > dir
      toto1.txt
      toto2.txt
      tata.txt
    > find -starts toto
      c:\chemin\toto1.txt
      c:\chemin\toto2.txt
      2 fichiers trouvés
    > find -ends toto1
      0 fichier trouvé
    > find -ends 1.txt
      c:\chemin\toto1.txt
      1 fichier trouvé
    > find toto
      0 fichier trouvé
    > find tata.txt
      c:\chemin\tata.txt
      1 fichier trouvé  
-   ajouter la commande "cat" qui prend en paramètre le nom d'un fichier dans le répertoire en cours et afficher son contenu à la console.
-   ajouter la commande "copy" qui copie un fichier dans un autre
    copy src dst
    crée un nouveau fichier dst qui a le même contenu que src
    le fichier src existe toujours
-   ajouter la commande "CRF" qui prend un paramètre et crée un fichier avec ce nom dans le répertoire en cours 
    (répertoire en cours == le chemin qu'affiche la commande pwd)
    > dir
     <DIR>  rep1
            f1.txt
    > crf f2.txt
    > dir
     <DIR>  rep1
            f1.txt
            f2.txt
            
-   ajouter la commande "CRD" qui prend un paramètre et crée un répertoire avec ce nom dans le répertoire en cours
    (répertoire en cours == le chemin qu'affiche la commande pwd)
    > dir
     <DIR>  rep1
            f1.txt
    > crf rep2
    > dir
     <DIR>  rep1
     <DIR>  rep2   
            f1.txt  
    
-   les commandes help, history, histclear, pwd, dir ne sont pas sauvegardées dans l'historique.
- d'autres modifications, nouvelles commandes peuvent être ajoutées à tout moment !
Collapse



