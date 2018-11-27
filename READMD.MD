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
            