pipeline {
    agent any
    tools {
        maven 'maven'
        jdk 'JDK'
    }
    stages {
        stage ('Build') {
            steps {
                sh 'mvn clean install' 
                publishHTML target: [
                    allowMissing: false,
                    alwaysLinkToLastBuild: false,
                    keepAll: true,
                    reportDir: 'target/generated-report',
                    reportFiles: 'index.html',
                    reportName: 'Cucumber Advance report'
                ]
            }
        }
    }
}
