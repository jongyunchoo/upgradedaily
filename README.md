# upgrade 일정관리


### 작성자 API 설계하기

|:기능:|:Method:|:URL:|:request:|:response:|:상태코드:|
|:순서추가:|:POST:|/api/username|요청 body|추가정보|200:정상추가|
|:작성자조회:|:GET:|/api/username|요청 body|단건응답정보|200:정상조회|
|:아이디조회:|:GET:|/api/username{usernameId}|요청 body|단건응답정보|200:정상조회|
|:비밀번호조회:|:GET:|/api/username{usernameId}|요청 body|단건응답정보|200:정상조회|


### 일정관리 API 설계하기

|:기능:|:Method:|:URL:|:request:|:response:|:상태코드:|
|:일정추가:|:POST:|/api/daily|요청 body|추가정보|200:정상추가|
|:일정조회:|:GET:|/api/daily|요청 body|단건응답정보|200:정상조회|
|:일정목록조회:|:GET:|/api/daily/{usenameId}|요청 body|다건응답정보|200:정상조회|
|:일정수정:|:PUT:|/api/dailies/{usenameId}|요청 body|수정정보|200:정상수정|
|:일정삭제:|:DELETE:|/api/daily/{usenameId}|요청 body|200:정상삭제|


### 댓글관리 API 설계하기

|:기능:|:Method:|:URL:|:request:|:response:|:상태코드:|
|:댓글추가:|:POST:|/api/daily|요청 body|추가정보|200:정상추가|
|:댓글조회:|:GET:|/api/daily|요청 body|단건응답정보|200:정상조회|
|:댓글전체조회:|:GET:|/api/daily/{usenameId}|요청 body|다건응답정보|200:정상조회|
|:댓글수정:|:PUT:|/api/dailies/{usenameId}|요청 body|수정정보|200:정상수정|
|:댓글삭제:|:DELETE:|/api/daily/{usenameId}|요청 body|200:정상삭제|
====================================================================

![img.png](/uploads/1848994ad25765da30fa8ef3684c67bc/img.png)
