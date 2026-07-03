def compileFun() { 
    stage('Compile') {
     echo 'compile the java source code'
        sh 'mvn clean compile'
     echo 'compilation is sucessfully'
    }
}
