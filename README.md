# spring

## Spring_DI (의존성 주입)
- xml파일에 bean을 등록해서 의존성을 주입
  - setter 메서드를 이용한 의존성 주입 : property
  - 생성자를 이용한 의존성 주입 : constructor-arg
  - [spring_DI_xml](https://github.com/suny1113/Spring/tree/main/src/spring_DI_xml)


- @Autowired 어노테이션을 이용한 의존성 주입
  - xml파일의 namespace -> context 클릭 -> context:annotation-config
  - [spring_DI_annotation](https://github.com/suny1113/Spring/tree/main/src/spring_DI_annotation)
  

- javaConfig를 통한 의존성 주입
  - xml파일에 bean을 등록하지 않고 자바 클래스에 bean을 등록
  - @Configuration 어노테이션과 @Bean 어노테이션 사용
  - [spring_DI_javaConfig](https://github.com/suny1113/Spring/tree/main/src/spring_DI_javaConfig)

## Spring_AOP (관점 지향 프로그래밍)
- 여러 객체에 공통으로 적용할 수 있는 기능을 분리함으로써 재사용을 높여주는 프로그래밍 기법
- 비즈니스 로직을 포함하는 핵심기능(Core Concern)과 핵심기능을 도와주는 부가기능(Cross-cutting Concern)으로 분리한다.

### AOP의 용어
|용어|설명|
|----|----|
|target|핵심기능을 담고있는 대상|
|advice|부가기능을 담고있는 모듈|
|join point| advice가 적용될 수 있는 위치|
|pointcut| advice를 적용할 타겟에 메서드를 선별하는 표현식
|weaving| pointcut에 의해 결정된 타겟의 join point에 부가기능을 삽입하는 과정|

- Spring에서는 런타임 시 Proxy 객체를 생성해서 공통기능을 추가하는 방법을 사용한다.

### [advice](Spring/src/spring_aop/advice) 의 종류
|종류|설명|
|---|----|
|MethodBeforeAdvice|메서드가 호출되기 전 공통기능을 수행|
|AfterReturningAdvice|메서드 리턴 후 공통기능을 수행|
|ThrowsAdvice|예외 발생 시점에 공통기능을 수행|
|MethodIntercepter|메서드 호출의 이전과 이후에 특정한 행동을 수행|

### Aspectj
-AOP의 확장기능

-[Aspectj설정](Spring/src/spring_aop/aspectj)

-[어노테이션활용](Spring/src/spring_aop/aspectj_annotation)
