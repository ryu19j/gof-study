### iteratorパターン

#### 各クラスの役割
* Aggregate[Aggregateの役]
  * 何かの集合体を表す
* Iterater[Iteratorの役]
  * 反復子(Aggregateに対して繰り返し処理を行う際に、状態を保持・操作をする)
* Character
  * キャラクター
* CharacterList[ConcreteAggregateの役]
  * キャラクターの集合体(Aggregateの実装クラス)
* CharacterListIterator[ConcreteIteratorの役]
  * CharacterList用のiterator実装クラス

#### 何が良いのか
CharacterListの実装が変わった場合でも、正しいiterator返してくれれば、
CharacterListを使用しているコードの動作に影響がない。
