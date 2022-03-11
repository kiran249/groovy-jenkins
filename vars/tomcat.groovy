def tomcat(){
  sshagent(['kiran']) {
                    sh 'scp -o StrictHostKeyChecking=no target/*.war ec2-user@44.201.109.181:/home/ec2-user/apache-tomcat-8.5.76/webapps/'
                    sh 'ssh ec2-user@44.201.109.181 /home/ec2-user/apache-tomcat-8.5.76/bin/shutdown.sh'
                    sh 'ssh ec2-user@44.201.109.181 /home/ec2-user/apache-tomcat-8.5.76/bin/startup.sh'
                }
            }
