def deployToTomcatFun(String warFile) {
    stage('Deploy to Tomcat') {
        sh "cp ${warFile} /opt/tomcat/webapps/"
	echo " deploye the application"
    }
}
