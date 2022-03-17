# DotComGame - 위치 맞추기 게임

## 게임 설명

* 세 명의 플레이어가 존재하는 게임에서 게임의 유저가 세 명의 플레이어가 가진 cell의 위치를 랜덤하게 추측하여 제거하는 게임이다. 

* 세 명의 플레이어는 각각 2개의 cell, 4개의 cell, 3개의 cell을 가지며, cell의 위치는 게임 시작시 랜덤으로 주어진다.

* 단, 3개의 cell을 가진 player의 cell은 2번을 맞추어야 제거된다.
유저가 플래이어가 가진 cell을 제거했을 때, 해당 플레이어의 남은 cell과 플레이어의 피해 정도를 보여준다.

* 모든 plater가 가진 모든 cell을 제거하면 게임이 종료되며, 게임의 결과로써 게임 종료시까지 유저가 얼마나 많은 추측을 했는지 보여진다.

* observer 패턴을 이용하여 상태 변화가 있을 때마다 알 수 있도록 하였다.

## 클래스 설명

### dotcomgame package

* DotCom

* DotComBust

* DotComLauncher : 게임을 시작하기 위한 main 메소드가 포함된 클래스

* GameHelper

* HeavyDotCom : 2번 맞아야 제거되는 cell을 3개 가지는 플레이어. 다른 플레이어 클래스와 달리 clone을 통해 cell의 위치가 리스트에 2번씩 저장될 수 있도록 추가로 메소드를 구현하였다.
상태 관찰을 할 때는 리스트에 중복된 cell을 제거하여 정확하게 관찰할 수 있도록 메소드를 override 하였다.

* LongDotCom : cell을 4개 가지는 플레이어에 대한 클래스

* ShortDotCom : cell을 2개 가지는 플레이어에 대한 클래스

### observer package

* DamageRate : Observer 인터페이스를 구현한 클래스로, 유저가 플레이어의 cell을 맞췄을 때 해당 플레이어의 피해 정도를 나타내기 위한 메소드를 구현함.

* SurvivingCells : Observer 인터페이스를 구현한 클래스로, 플레이어의 살아있는 cell 목록을 보여주기 위한 메소드를 구현함.

* Observer : observer 인터페이스. DotCom 객체의 상태를 모니터링함.

* Observable : observer 리스트를 만들고 observer 객체의 등록, 해제, 상태 변경시 observer 객체에게 알리는 메소드 구현.
