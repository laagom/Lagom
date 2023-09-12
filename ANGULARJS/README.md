# 목차
1. [AngularJS Intro](#angular-js-intro)

## Angular JS Intro
Angular JS 란 SPA라는 `단일 페이지 어플리케이션(Single Page Application) 프레임워크이다.` Javascript 기반으로 MVVM(Model - View - View Model) 모델링이 가능하다.

### 왜 Angular JS를 사용하는가?
- 유지보수가 쉽고, 개발속도가 빠르다.
- 간편한 데이터 바인딩을 통해 뷰 업데이트가 쉽다.
- 코드 패턴이 동일해 개인간 차이에 따른 결과물의 차이가 적다.
- SPA 개발에 최적화되어 있다.
- 기능적인 분리가 명확해 협업이 쉽다.

### HTML 페이지에 추가되는 script 태그
```HTML
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
```
위의 스크립트 태그를 이용해서 HTML에서 사용이 가능하다.

### Angular JS Extends HTML
```HTML
<!DOCTYPE html>
<html lang="en">
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>AngularJS Example</title>
</head>
<body>
    <!-- Angular JS가 무엇인지 모르지만 특별한 이벤트 처리를 하지 않고 동적으로 input의 입력 TEXT
        {{name}} 위치에 렌더링 해주고 있음
    -->

    <!-- ng-app 속성이 빠지면 작동하지 않음 -->
    <div ng-app="">
        <!-- ng-model과 {{}} 태그 안에 들어가는 명칭이 동일해야 함 -->
        <p>Name : <input type="text" ng-model="name111"></p>
        <h1>Hello {{name}}</h1>
    </div>
</body>
</html>
```
- ng-app : angular js의 지시자 정의
- ng-model : angular js의 지시자 바인더, HMTL 컨트롤(input, select, textarea)의 데이터를 바인딩
- ng-bind : angular js 의 데이터 바인딩

### Angular JS Directives
기본적으로 Angular JS의 지시어에는 ng 접두사가 붙으며 HTML 속성으로 사용이 된다. 
- ex)  ng-init : 어플리케이션 변수 초기화
```HTML
<div ng-app="" ng-init="first-name='John'">
    <p>The name is <span ng-bind="first-name"></span></p>
</div>
```
- ng-app, ng-init 대신 data-ng-app, data-ng-init 등을 사용할 수 있음.

### Angular JS Expressions
Angular JS의 표현식은 이중 중괄호 {{}}이며, 표현식이 작성된 위치에 데이터를 출력한다.

```HTML
<p>My first expression: {{ 5 + 5 }}</p>

or

<p>My first expression: <span ng-bind=""></span></p>
```
- 특정 ng-model에 대한 값을 ng-bind를 이용하여 표현식을 사용할 수 있음.

