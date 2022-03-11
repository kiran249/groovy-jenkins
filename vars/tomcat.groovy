def call("ip,user,credential){
  sshagent(['credential']) {
    sh 'scp -o StrictHostKeyChecking=no target/*.war ${user}@${ip}:/home/ec2-user/apache-tomcat-8.5.76/webapps/'
    sh 'ssh ${user}@${ip} /home/ec2-user/apache-tomcat-8.5.76/bin/shutdown.sh'
    sh 'ssh ${user}@${ip} /home/ec2-user/apache-tomcat-8.5.76/bin/startup.sh'
                }
            }
