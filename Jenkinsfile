pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Build'
              
            }
        }

    stage('Test') {
        steps {
            echo 'Test'
        }
    }

    stage('Sonar scanning') {
        steps {
            echo 'Sonar Scan'
        }
    }
    
    stage('Publish Artifactory') {
        steps {
            echo 'Artifact'
        }
    }

    stage(Deploy to Dev) {
        steps {
            echo 'Dev'
        }
    }

    stage(Deploy to Test) {
        steps {
            echo 'Test'
        }
    }

    stage(Deploy to UAT) {
        steps {
            echo 'UAT'
        }
    }

    stage(Deploy to Stage) {
        steps {
            echo 'Stage'
        }
    }

    stage(Deploy to Prod) {
        steps {
            echo 'Prod'
        }
    }
}