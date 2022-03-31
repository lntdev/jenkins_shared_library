def call(Map stageParams){
  checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: 'dbc63470-9349-4a5a-b62c-41e0a4b1876b', url: 'https://github.com/lntdev/junit-automation.git']]])
}
