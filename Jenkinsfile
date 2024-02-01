pipeline {
    agent any	
  environment {
    MAVEN_ARGS=" -e clean install"
    registry = ""
    dockerContainerName = 'bookapi'
    dockerImageName = 'bookapi-api'
  }


  stage('docker-compose start') {
      steps {
       sh 'docker compose up -d'
      }
    }
  }
}
