# 📈 STO 판매 
#### STO 등록 / 매각, 판매, 거래 중 판매 부분

프로젝트 환경 :
+ front - React
+ back - Spring Boot / Gradle / JPA

## 📂 DB 테이블 구성
<img width="800" alt="image" src="https://user-images.githubusercontent.com/46402145/196331118-43897c33-380b-4425-9613-7801d2781cd7.png">

## 🏆 화면 구성 및 동작 과정

#### 화면 구성:
+  홈화면
+ 판매상품목록
+ 상품 세부 정보 및 구매
+ 판매완료상품목록
+ 상품별 보유 유저 목록 
+ 유저별 상품 보유 목록
+ 거래 내역

#### 동작 과정 :

1. 홈화면 에서 판매 정보 초기화와 구매를 진행할 회원 선택
	
2. 판매상품목록 페이지로 넘어가 상품  구매 버튼 클릭
	
3.  상품페이지에서  조각 개수 선택해 구매
	
4. 상품보유목록, 유저 보유목록, 거래내역 페이지에서 추가된 판매 정보 확인

5. 상품보유목록에서 판매된 상품의 판매  취소 후 다시 판매 정보 업데이트 확인

