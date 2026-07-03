def deployToTomcatFun(String warFile) {
    stage('Deploy to Tomcat') {
        sh 'cp target/calendar.war /opt/tomcat/webapps/'
	echo " deploye the application"
    }
}
