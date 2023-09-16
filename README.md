# 😳 WebBackEnd_PJT
## 🍹 2023-09-15
## 🐥팀원_조한빈 이수민 이창헌 이예원
---
### 프로젝트 기능 구현 설명
---
- 기능 구현
1. 조회수 기준 영상 나열

2. 운동부위별 영상 나열

3. 운동 영상에 대한 리뷰관리 백엔드 기능 구현

4. 목록, 등록, 수정, 상세, 삭제 기능 구현


### 메인페이지 벡앤드 기능 구현
---
메인 UI

![image](https://github.com/changbill/WebBackEnd_PJT/assets/128214736/7d0dcfce-7b9c-4ae2-b5f4-7c786686b27a)

---

Dto 코드

![image](https://github.com/changbill/WebBackEnd_PJT/assets/128214736/368194dd-622b-472a-8312-94743b84284f)

---

- 조회수 기준 영상 나열
Controller 코드

![image](https://github.com/changbill/WebBackEnd_PJT/assets/128214736/170d4bb6-f608-40d3-b2d7-2de65df702be)

: ????????

---

Service 코드

![image](https://github.com/changbill/WebBackEnd_PJT/assets/128214736/cde5a16b-5ab9-489c-b046-aa347a6c419f)

: Dao.updateViewCnt에서 조회수 더해주고 dao.selectOne를 통해 해당 영상 반환

---

Dao 코드

![image](https://github.com/changbill/WebBackEnd_PJT/assets/128214736/d36e1b94-a9b4-4a10-85c8-2ebee01982ee)

: 조회수 하나 더해주기

---



![image](https://github.com/changbill/WebBackEnd_PJT/assets/128214736/1d0af09c-fe3e-4414-ac11-d5c38d0883f4)

: video 하나만 골라서 service로 전달

---

  
- 운동부위별 영상 나열
Controller 코드

![image](https://github.com/changbill/WebBackEnd_PJT/assets/128214736/4b137e7d-3699-4d71-94c1-cde6f6f4f0ef)

: 

---

Service 코드

![image](https://github.com/changbill/WebBackEnd_PJT/assets/128214736/f64cce1c-bfd8-405b-9f09-dbff4912942c)
  
: 

---


### 운동영상에 대한 리뷰관리 백엔드 기능 구현 
---
  Dto 코드
  
  ![image](https://github.com/changbill/WebBackEnd_PJT/assets/128214736/8664a259-b06b-427e-9d0a-d2fb048014e4)


- 운동 영상에 대한 리뷰관리 백엔드 기능 구현
  Controller 코드
  Dao 코드

- 목록, 등록, 수정, 상세, 삭제 기능 구현
  Controller 코드
  Dao 코드

### 소감문
🦍 조한빈 : 협업 관리 툴에 대한 사용 방법과 프론트엔드단, 백엔드단에서 각각 처리해줘야 할 일에 대해 조금 더 이해할 수 있었다. 
깃허브를 이용한 프로젝트 커밋 방법을 학습해 프로젝트 관리를 할 수 있었고, 기존에 만들어 놓은 프론트엔드 프로젝트 작업물에서 어떤 부분들을 수정해야
데이터의 전달과 처리가 가능한지 하나하나 확인할 수 있었습니다. 막연히 어려워보였던 백엔드에 대해 조금은 더 쉽게 다가갈 수 있게 된 것 같습니다.


🙈 이수민 : 초반에는 패키지도 많고, 클래스도 많아서 작업하기 어려웠다. 그렇지만 팀원들과 상의하면서 최대한 해보는 데까지 해보자는 마인드로 프로젝트를 진행했다. 
특히 분업이 잘 되었던 점이 기억에 남는다. 그리고 깃을 처음에 쓰지 않았는데, 나중에 각자의 작업물을 합칠 때 깃의 중요성을 다시금 깨닫게 되었다. 깃 열심히 정복해야겠다. 


🦸‍♂️ 이창헌 : 지난번 프론트 프로젝트와 연결하여 백엔드 면에서 부족했던 점들을 보완했다. 그러면서 점점 더 실제로 쓰일만한 홈페이지에 가까워지고 있는 것 같다. 이러한 프로젝트들을 통해 앞으로 현업에 가서 하게 될 일에 대해 파악할 수 있었다. 또한 파일이 많아지고 협업 할 것이 많아지면서 깃의 필요함을 느낄 수 있었다. 그래서 이번 기회에 깃에 대해 공부해보고 활용하면서 개발자들이 어떻게 협업하는지에 대해 조금은 배울 수 있었던 것 같다.


🤥 이예원 : 우선 처음에는 내가 뭘 해야할지 몰라서 막막했는데 팀원들이 틀을 잘 잡아주어서 나도 내가 할 수 있는 최대한으로 프로젝트에 임할 수 있었다. 다들 깃에 익숙하지 않아서 깃을 활용하지 않고 작업하다보니 나중에 합치는 데 머리가 좀 아팠다. 이번 기회로 백엔드가 어떤 식으로 구현되는지 잘 이해할 수 있었고, 깃에 대해 열심히 공부해서 앞으로는 꼭 깃을 활용해야겠다.

---

