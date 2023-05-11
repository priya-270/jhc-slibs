def call(){
  sshagent(['tomcat-dev']) {
     sh "scp target/hr-api.war ec2-user@172.31.32.245:/opt/jenkin-test/webapps/"
      sh "ssh ec2-user@172.31.32.245 /opt/jenkins-test/bin/shutdown.sh"
      sh "ssh ec2-user@172.31.32.245 /opt/jenkins-test/bin/startup.sh"
        }
   }
