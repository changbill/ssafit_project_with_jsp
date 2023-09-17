# 😳 WebBackEnd_PJT
## 🍹 2023-09-15
## 🐥팀원_조한빈 이수민 이창헌 이예원
---
## 프로젝트 기능 구현 설명
---
### 기능 구현
1. 조회수 기준 영상 나열
video.model 패키지에서 dto, dao, service를 제작했습니다. dto에서는 id, title, part, channelName, url 변수를 만들어 영상의 id, 제목, 운동부위, 채널이름, url 데이터를 사용하고자 했습니다.
dao에서 updateViewCnt라는 메소드를 만들어 조회수를 하나씩 더해주었고, 이를 service로, 그리고 다시 controller로 전달했습니다.
controller에서는 service에서 받아온 영상 전체리스트를 조회수 기준으로 재정렬하는 알고리즘을 구현했고 이를 최종적으로 detail.jsp과 같은 view단에 전달했습니다.

2. 운동부위별 영상 나열
dao에서 selectPart라는 메소드를 만들어 dto변수 중에 part가 동일하다면 partList에 넣어주고 이를 반환하는 알고리즘을 만들었습니다. 이를 service로, 그리고 다시 controller로 전달했습니다. controller에서는 service에서 받아온 운동부위별 영상 리스트를 조회수 기준으로 재정렬하는 알고리즘을 구현했고 이를 최종적으로 index.jsp과 같은 view단에 전달했습니다.

3. 운동 영상에 대한 리뷰관리 백엔드 기능 구현
review.model 패키지를 따로 만들어 dto, dao, service를 제작했습니다. dto에서는 reviewId, title, writer, regDate 변수를 만들어 리뷰의 id, 제목, 작성자, 작성날짜 데이터를 사용하고자 했습니다.

4. 목록, 등록, 수정, 상세, 삭제 기능 구현
Dao에서 리뷰 등록, 수정, 삭제 기능을 구현했고 이를 service로, 그리고 다시 Controller로 전달해 최종적으로 view단인 detail.jsp, registerForm.jsp, reviewApplyForm.jsp, reviewUpdateForm.jsp 등으로 보냈습니다. 이러한 과정을 통해 사용자에 맞춰 화면속 요소가 변경되는 동적인 홈페이지를 만들 수 있었습니다.

---

## 메인페이지 벡앤드 기능 구현
---
- 메인 UI

![image](https://github.com/changbill/WebBackEnd_PJT/assets/128214736/7d0dcfce-7b9c-4ae2-b5f4-7c786686b27a)

---

- Dto 코드

![image](https://github.com/changbill/WebBackEnd_PJT/assets/128214736/368194dd-622b-472a-8312-94743b84284f)

---

### 조회수 기준 영상 나열
- Controller

![image](https://github.com/changbill/WebBackEnd_PJT/assets/128214736/170d4bb6-f608-40d3-b2d7-2de65df702be)

: Servlet에서 요청을 받아오고 id 파라미터를 통해 영상을 특정화 한 다음 service.getBoard에 보낸다. 이후 조회수 기준으로 영상 리스트를 재정렬해준 뒤 세션에 담아주고, detail.jsp로 포워딩해줬다.

---

- Service

![image](https://github.com/changbill/WebBackEnd_PJT/assets/128214736/cde5a16b-5ab9-489c-b046-aa347a6c419f)

: Dao.updateViewCnt에서 조회수 더해주고 dao.selectOne를 통해 해당 영상 반환

---

- Dao

![image](https://github.com/changbill/WebBackEnd_PJT/assets/128214736/d36e1b94-a9b4-4a10-85c8-2ebee01982ee)

![image](https://github.com/changbill/WebBackEnd_PJT/assets/128214736/1d0af09c-fe3e-4414-ac11-d5c38d0883f4)

: 조회수 하나 더해주기, video 하나 특정화해서 service로 전달

---

  
### 운동부위별 영상 나열
- Controller

![image](https://github.com/changbill/WebBackEnd_PJT/assets/128214736/b0ce5c9a-5fc8-450a-bd84-a657c00c7c03)

: 전신, 상체, 하체, 복근 운동부위 별로 list를 만들어 이를 또 조회수 순으로 정렬시키고 세션으로 전달했습니다. 그리고 index.jsp로 포워딩했습니다.

---

- Service

![image](https://github.com/changbill/WebBackEnd_PJT/assets/128214736/f64cce1c-bfd8-405b-9f09-dbff4912942c)
  
: 전신, 상체, 하체, 복근 운동부위 별로 list를 만들어 컨트롤러에 반환했습니다.

---


### 운동영상에 대한 리뷰관리 백엔드 기능 구현 
---
- Dto 코드

![image](https://github.com/changbill/WebBackEnd_PJT/assets/128214736/8664a259-b06b-427e-9d0a-d2fb048014e4)

  
---

### 등록

- Review 작성 UI
![image](https://github.com/changbill/WebBackEnd_PJT/assets/128214736/e15b47e1-f2c7-4b58-b1a8-8075e685a37a)

---
- Controller
![image](https://github.com/changbill/WebBackEnd_PJT/assets/128214736/9a9b8a02-3f90-4e93-8880-4bb559e4b116)

---
- service
![image](https://github.com/changbill/WebBackEnd_PJT/assets/128214736/d748e34a-2645-4191-b03b-1951a756bc6d)

---
- Dao
![image](https://github.com/changbill/WebBackEnd_PJT/assets/128214736/21f0095b-6204-44f9-94fc-029d18fb2df2)


### 수정

- Review 수정 UI
![image](https://github.com/changbill/WebBackEnd_PJT/assets/128214736/71c3ccd0-692c-4f4b-80a6-43f0c5c10881)

---
- Controller 코드
![image](https://github.com/changbill/WebBackEnd_PJT/assets/128214736/729b1fbf-71a4-46b6-9697-ddadaf76489d)

---
- service
![image](https://github.com/changbill/WebBackEnd_PJT/assets/128214736/1d10dab1-1728-473a-ac52-c78941adcba4)

---
- Dao
![image](https://github.com/changbill/WebBackEnd_PJT/assets/128214736/811cfe03-f1f6-4950-9aaf-52d152433ac3)


### 상세

- Review 상세화면 UI
![image](https://github.com/changbill/WebBackEnd_PJT/assets/128214736/c42709e5-f2ab-40bd-adf6-60edaa6c5d1b)

---
- Controller
![image](https://github.com/changbill/WebBackEnd_PJT/assets/128214736/f54f04ad-1661-4ad1-ab09-e00d4fc9f849)

---
- service
![image](https://github.com/changbill/WebBackEnd_PJT/assets/128214736/2151211c-cfcd-41cf-8d6a-fa478e93e01d)
![image](https://github.com/changbill/WebBackEnd_PJT/assets/128214736/49195d93-f3b7-43bb-910b-cea852079e32)

---
- Dao
![image](https://github.com/changbill/WebBackEnd_PJT/assets/128214736/630f23de-6c2c-4a49-9254-17522c7e9920)
![image](https://github.com/changbill/WebBackEnd_PJT/assets/128214736/5b7db4b5-b380-4a82-9bd4-82440ea0c570)

### 삭제

- Controller
![image](https://github.com/changbill/WebBackEnd_PJT/assets/128214736/8d487bbc-3a74-4450-81eb-acba46e6cf1f)

---
- Service
![image](https://github.com/changbill/WebBackEnd_PJT/assets/128214736/26527566-1c69-453d-9155-3733b5bbdd4c)

---
- Dao
![image](https://github.com/changbill/WebBackEnd_PJT/assets/128214736/2369b6a6-320e-46c6-a4a7-ee230da2caa2)

  

### 소감문
🦍 조한빈 : 협업 관리 툴에 대한 사용 방법과 프론트엔드단, 백엔드단에서 각각 처리해줘야 할 일에 대해 조금 더 이해할 수 있었다. 
깃허브를 이용한 프로젝트 커밋 방법을 학습해 프로젝트 관리를 할 수 있었고, 기존에 만들어 놓은 프론트엔드 프로젝트 작업물에서 어떤 부분들을 수정해야
데이터의 전달과 처리가 가능한지 하나하나 확인할 수 있었습니다. 막연히 어려워보였던 백엔드에 대해 조금은 더 쉽게 다가갈 수 있게 된 것 같습니다.


🙈 이수민 : 초반에는 패키지도 많고, 클래스도 많아서 작업하기 어려웠다. 그렇지만 팀원들과 상의하면서 최대한 해보는 데까지 해보자는 마인드로 프로젝트를 진행했다. 
특히 분업이 잘 되었던 점이 기억에 남는다. 그리고 깃을 처음에 쓰지 않았는데, 나중에 각자의 작업물을 합칠 때 깃의 중요성을 다시금 깨닫게 되었다. 깃 열심히 정복해야겠다. 


🦸‍♂️ 이창헌 : 지난번 프론트 프로젝트와 연결하여 백엔드 면에서 부족했던 점들을 보완했다. 그러면서 점점 더 실제로 쓰일만한 홈페이지에 가까워지고 있는 것 같다. 이러한 프로젝트들을 통해 앞으로 현업에 가서 하게 될 일에 대해 파악할 수 있었다. 또한 파일이 많아지고 협업 할 것이 많아지면서 깃의 필요함을 느낄 수 있었다. 그래서 이번 기회에 깃에 대해 공부해보고 활용하면서 개발자들이 어떻게 협업하는지에 대해 조금은 배울 수 있었던 것 같다.


🤥 이예원 : 우선 처음에는 내가 뭘 해야할지 몰라서 막막했는데 팀원들이 틀을 잘 잡아주어서 나도 내가 할 수 있는 최대한으로 프로젝트에 임할 수 있었다. 다들 깃에 익숙하지 않아서 깃을 활용하지 않고 작업하다보니 나중에 합치는 데 머리가 좀 아팠다. 이번 기회로 백엔드가 어떤 식으로 구현되는지 잘 이해할 수 있었고, 깃에 대해 열심히 공부해서 앞으로는 꼭 깃을 활용해야겠다.

---

