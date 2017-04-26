curl ${CFGURL} -o application.yml
java -jar edu-user.jar server application.yml
