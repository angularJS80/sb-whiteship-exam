spring boot 백기서님 유튭 강좌 보고 따라해보기
1. day001
  1 ) maven
    - docs.spring.io 에서 getting start
    - docs.spring.io 에서 기본 pom.xml 참조 해서 프로젝트 생성 및 실행
    - dependencyManagenent 사용해봄
    - spring application 생성 및 간단한 RestController 만들어서 호출해봄

2. day002
   1) dependencyManagenent 를 이용시 복잡도 증가 parent pom 참조해서 그외 버전이 다른것만 오버라이드 해서 구성해보기
   2) Bean 등록 형태 확인해보기 위한 테스트 클레스 작성
      - @AutoWired 시 @Service 이용
      - @AutoWired 시 @ComponentScan 에서 @Configration 내부의 @Bean 가져오기
      - @AutoWired 시 @Import 에서 @Configration된 클래스 지정하여  내부의 @Bean 가져오기
            
3. day003
   1) application.xml 에 정의된 Bean 설정 가져오기
   2) @SpringBootApplicaion 어노테이션에 EnableAutoconfiration , ComponetScan등이 이미 포함되어있다.
   3) 프라이머리 컨피그에 붙이기를 권장한다. 
   4) jar 파일로 만들어서 실행시 옵션에 -- debug 옵션을 주고 AutoConfig 에 대한 내역을 볼 수 있다.
      Condition report 에 파시티브와 네거티브로 설정된것과 제외된것이 표현된다.
   5) 자동설정을 제외 하고 싶으면 applicaton.properties 또는 @EnableAutoConfigration 어노테이션에 제외할 대상을 excloud 키에 클래스명으로 나열
   6) 생성자가 하나라면 @AutoWired 없이 사용 가능하다
   7) 오류가 나는데 application.xml 을 제거 했다가다시 복구 시키면 가동하는 오류 이건..모르겠음.   
   
4. day004
   1) application.xml  - > beanconfig.xml 로변경
   2) static resource 추가 
   3) spring-boot-devtools 디펜던씨 추가 ( 개발편의 라이브러리로 빌드만해도 실행중인 어플리케이션에 반영 등등의 기능 )  
   