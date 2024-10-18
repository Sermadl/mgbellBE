# 마감벨 🔔

## 👫 팀원 소개

### Backend & Infra

### **👩🏻‍💻** **김세은**

- 백엔드 및 데이터베이스 설계
- 데이터베이스 관리
- Devops 구축 및 운영
- 테스트 관리 및 자동화

### Frontend

### 💁🏻‍♀️ 이가은

- 프론트엔드 설계
- 성능 최적화
- UX/UI 개선
- ReactJS 프레임워크를 통하여 웹화면의 컴포넌트를 설계

## **📌** 프로젝트 목표

- 마감벨은 베이커리 가게에서 당일 판매되지 않은 신선한 빵을 활용하여 랜덤박스 형태로 저렴하게 제공하는 서비스이다. 이를 통해 음식물 쓰레기를 줄이고 환경 보호에 기여하며, 동시에 베이커리 상점의 수익성을 향상시키고 소비자에게는 품질 좋은 빵을 합리적인 가격에 제공하고자 한다.

## ✅ 시스템 구현범위

- SNS 회원가입 혹은 자체 회원가입 및 로그인
- 가게 등록/수정/삭제 및 리스트 확인하기(리뷰수, 별점, 거리, 주문량으로 정렬 가능)
- 가게 상세 정보 확인하기 (리뷰수, 별점, 메뉴, 거리, 주문량)
- 판매 글 등록/수정/삭제 및 이미지 업로드
- 관심 가게 설정
- 상품 구매 구현
- 주문 내역 확인하기
- 관심 상점 판매 등록 알림
- 내정보 확인 및 수정/저장
- 지도로 주변 가게 및 재고 확인

## 🛠️ 사용 기술 검토하기

- 스프링부트와 Mysql(RDB)를 같이 사용하는 이유
    - 객체지향언어의 객체와 RDB가 매칭하기 편리하다
    - ORM(JPA)을 통해 쿼리 작성없이 개발자 친화적으로 개발 가능하다.
    - 객체 중심의 개발을 통해 개발의 생산성을 높일 수 있다.
    - 스프링부트 프로젝트 특성상 프로그램의 확장 및 변경에 쉽게 반응하여 개발을 할 수 있다.
- 안드로이드 앱 사용 이유
    - 앱 스토어를 통한 배포로 사용자들이 쉽게 서비스를 발견하고 다운로드할 수 있다.
    - 푸시 알림 기능을 통해 중요한 정보나 업데이트를 즉시 전달할 수 있다.
    - 모바일 기기의 GPS, 카메라 등 하드웨어 기능을 활용하여 더 다양하고 풍부한 기능을 제공할 수 있다.
    - 모바일 기기에 최적화된 UI/UX를 제공하여 사용자 경험을 향상시킬 수 있다.
- AWS 사용하는 이유
    - EC2
        - 물리 서버의 비용 문제로 인해 사용량 만큼만 비용 지불을 하면 되는 EC2를 사용
    - S3
        - EC2 인스턴스 내에 파일 저장 시 인스턴스 용량과 관련된 문제가 발생하기 때문에 파일 저장을 외부에서 진행 할 수 있는 AWS S3 서비스를 사용
        - 파일 저장에 대한 내구성이 보장되어있고 용량에 대한 확장성이 매우 뛰어나 물리 파일 서버를 구비하는것에 비해 비용 절감이 가능하다
    - RDS
        - 저렴한 비용으로 안정성이 높은 데이터베이스를 손쉽게 관리할 수 있음
- mysql 사용 이유
    - mysql은 데이터베이스 순위에서 여전히 2위를 지키고 있는 등 점유율 면에서도 높은 모습을 보여주며, 높은 점유율에 따른 많은 레퍼런스가 존재하기 때문에 채택하였다. 또한, 오픈 소스 데이터베이스로, 무료로 사용할 수 있어 비용 면에서 효율적이다. 대규모 데이터 세트에서도 빠른 쿼리 실행 속도를 제공하며, 필요에 따라 쉽게 확장할 수 있다. 보안 면에서도 우수하여 데이터를 안전하게 보호할 수 있다. ACID(원자성, 일관성, 고립성, 지속성) 속성을 준수하여 안정적인 트랜잭션 처리가 가능히다.
- 아임포트(포트원) 사용 이유
    - 신용카드, 계좌이체, 가상계좌 등 여러 결제 방식을 통합적으로 제공하며, 개발자 친화적인 API로 쉽고 빠른 결제 시스템 구현이 가능하다. PCI-DSS 인증을 받아 안전한 결제 처리를 보장한다. 웹, 모바일 웹, 앱 등 다양한 환경에서 사용 가능하다. 비즈니스 요구사항에 맞춰 결제 프로세스를 조정할 수 있다. 높은 가용성과 안정성을 제공하여 결제 실패율을 최소화한다.

## ⚠️ **Constraints**

- 짧은 개발기간으로 인한 프로젝트 완성도 향상의 어려움
- 결제 관련 API 사용의 미숙함
    - 결제 취소나 환불 프로세스를 올바르게 구현하지 못해 사용자의 불만이 발생할 수 있음
    - API를 통해 전송되는 결제 정보와 실제 주문 정보가 일치하지 않아 혼란이 발생할 수 있음
    - 결제 관련 법규나 규정을 충분히 이해하지 못해 법적 문제가 발생할 수 있습니다.

이러한 문제들을 방지하기 위해 결제 API에 대한 충분한 학습과 테스트, 그리고 보안 관련 지식을 쌓을 것임

## 📖 ERD

![image.png](%E1%84%86%E1%85%A1%E1%84%80%E1%85%A1%E1%86%B7%E1%84%87%E1%85%A6%E1%86%AF%20%F0%9F%94%94%2010214cf1132680c7b966e1aa7bbeb6de/image.png)

## ⚙️ System Architecture

![image.png](%E1%84%86%E1%85%A1%E1%84%80%E1%85%A1%E1%86%B7%E1%84%87%E1%85%A6%E1%86%AF%20%F0%9F%94%94%2010214cf1132680c7b966e1aa7bbeb6de/image%201.png)

## 📚 Stacks

### Infra

| category | version |
| --- | --- |
| AWS ec2 |  |
| AWS S3 |  |
| AWS RDS |  |
| Docker |  |
| Github Actions |  |
| Nginx |  |

### Backend

| category | version |
| --- | --- |
| Springboot | 3.2.4 |
| Mysql | 8.0.36 |
| Junit | JUnit5 |
| Redis | 7.2.4 |

### Frontend

| category | version |
| --- | --- |
| React | 18.2.0 |
| Vercel |  |
| React Query | 5.0.0 |

## 🗓️ 개발 계획

### ⌨️ 애자일 스크럼 방식을 이용하여 개발 계획 수립

![image.png](%E1%84%86%E1%85%A1%E1%84%80%E1%85%A1%E1%86%B7%E1%84%87%E1%85%A6%E1%86%AF%20%F0%9F%94%94%2010214cf1132680c7b966e1aa7bbeb6de/image%202.png)

- 총 7번의 스프린트를 통해 개발하는 계획
- 매주 금요일 스크럼을 통해 스프린트당 총 2회의 정기회의를 진행
- 스프린트 시작 시 백로그에서 달성 목표에 해당하는 기능을 할당하여 칸반 보드로 관리
- 효율적인 업무 분배를 위해 각 스토리 혹은 태스크마다 포인트 설정 후 해당 포인트의 합이 비슷하도록 스크럼 시 업무 분배 진행
- 스프린트1
    - 회원가입 및 로그인 기능(일반 사용자)
    - 회원가입 및 로그인 화면 구성
- 스프린트2~3
    - 메인 화면(게시글 리스트)
    - 판매글 등록/수정/삭제/조회
    - 가게 등록/수정/삭제/조회
    - 사장님 회원가입 및 매장 등록
- 스프린트4
    - CI/CD 구축
    - 주문 요청/수락/취소/거절
- 스프린트5
    - 즐겨찾기 기능
    - 주문 내역 조회
    - 리뷰
- 스프린트6
    - 환경설정(회원 정보 수정/탈퇴/로그아웃)
    - 마이페이지
    - 알림
- 스프린트7
    - 서비스 안정화
    - 유지 보수 및 신규 기능 회의

## ✏️테스트 계획

### 기능 테스트

- TDD 방식으로 진행
    - 각 도메인 마다 service, repository 등 각각의 기능 설계
    - 각각의 기능에 대한 테스트를 먼저 실패하도록 생성
    - 실패하는 테스트를 성공하도록 기능을 구현하여 테스트 완료
    - 기능테스트부터 시작하여 사용자 예상 시나리오 통합 테스트 그리고 스프링부트 테스트까지 통합하여 진행
- 코드 품질 검사
    - 배포 과정에서 sonarcube를 통한 소프트웨어 품질 검사
    - 배포 완료 후 Jmeter를 통한 부하 테스트

### 사용자 테스트

- 일반 사용자 및 사장님 어플 실제 사용 테스트
    - 실제 가게에 적용하여 판매글 작성부터 주문 까지 모든 과정을 테스트하고 만족도 조사를 할 수 있도록 함
    - 사용자와 사장님에게 실제 사용을 하면서 불편했던 점, 오류가 발생한 지점 등을 조사하여 버그 수정
- A/B 테스트 진행
    - 두개의 사용자 군에게 행사 목록 조회 및 참여 과정이 다른 두개의 앱을 제공 후 만족도 조사
    - 만족도가 높은 군의 구현 내용을 기반으로 반대군의 좋은 점을 적용하여 수정