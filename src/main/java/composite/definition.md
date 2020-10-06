# Composite Pattern
여러 개의 객체들로 구성된 복합 객체와 단일 객체를 클라이언트에서 구별없이 다루게 해주는 패턴
- 전체-부분의 관계 (이를테면 디렉토리-파일)를 갖는 객체들 사이의 관계를 정의할 때 유용하다.

![Composite](./composite.png) 

## 구성요소
- Component : 구체적인 부분, 즉 Leaf 클래스와 전체에 해당하는 Compoite 클래스에 공통 인터페이스를 정의
- Leaf : 구체적인 부분 클래스, Compoite 객체의 부품으로 설정
- Composite : 전체 클래스, 복수개의 컴포넌트를 갖도록 정의하며 복수개의 Leaf, 복수개의 Compoite 객체를 부분으로 가질 수 있음.


## 특징
이 패턴을 사용하면 부분 객체의 추가나 삭제 등이 있어도 전체 객체의 클래스 코드를 변경하지 않아도 된다.
일대다 관계의 행위를 이해하기 쉽게 설계할 수 있음.

## 데코레이터 패턴과의 차이점
https://stackoverflow.com/questions/2233952/difference-between-the-composite-pattern-and-decorator-pattern
