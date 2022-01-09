pipeline {
	agent any
	stages {
		stage ('Retrieve'){
			steps {
				git branch: 'main',  url: 'https://github.com/nvierass/Backend'
			}
		}
		stage('Analisis') {
			steps {
				echo "Prueba JF y Weebhook build"
			}
		}
		stage('Test') {
			steps {
				echo "Prueba JF y Weebhook test"
			}
		}
	}
}
