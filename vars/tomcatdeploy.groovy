def call(user,ip,credId){
  sshagent([credId]) {
     sh "scp target/hr-api.war ${user}@${ip}:/opt/jenkin-test/webapps/"
    sh "ssh ${user}@${ip} /opt/jenkins-test/bin/shutdown.sh"
      sh "ssh ${user}@${ip} /opt/jenkins-test/bin/startup.sh"
        }
   }
