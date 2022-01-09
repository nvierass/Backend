pipeline {
	agent any
	stages {
		stage('Retrieve') {
			steps {
				git 'https://github.com/nvierass/Backend.git'
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
		stage('Image creation'){
			steps{

			}
			
		}
	}
}
