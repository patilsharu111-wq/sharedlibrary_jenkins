def buildFun() {
    stage('Build') {
    echo "build the stage"
        sh 'mvn clean package'
    echo "build is successfully generated "
    }
}

