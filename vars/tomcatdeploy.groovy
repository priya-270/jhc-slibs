def call(user,ip){
  sshagent(['tomcat-dev']) {
     sh "scp target/hr-api.war ${user}@${ip}:/opt/jenkin-test/webapps/"
    sh "ssh ${user}@${ip} /opt/jenkins-test/bin/shutdown.sh"
      sh "ssh ${user}@${ip} /opt/jenkins-test/bin/startup.sh"
        }
   }
