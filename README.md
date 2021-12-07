# spring

## spring_DI (의존성 주입)
- xml파일에 bean을 등록해서 의존성을 주입
  - setter 메서드를 이용한 의존성 주입 : property
  - 생성자를 이용한 의존성 주입 : constructor-arg
  - [spring_DI_xml](Spring/src/spring_DI_xml)


- @Autowired 어노테이션을 이용한 의존성 주입
  - xml파일의 namespace -> context 클릭 -> context:annotation-config
  - [spring_DI_annotation](Spring/src/spring_DI_annotation)
  

- javaConfig를 통한 의존성 주입
  - xml파일에 bean을 등록하지 않고 자바 클래스에 bean을 등록
  - @Configuration 어노테이션과 @Bean 어노테이션 사용
  - [spring_DI_javaConfig](Spring/src/spring_DI_javaConfig)
