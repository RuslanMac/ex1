����   4 d
 	 F	  G	  H	  I	  J
 	 K L
 M N O
 M P Q
  F R
  S
  T Uxcxcxcxc
  V W X
  Y id Ljava/lang/Long; number Ljava/lang/String; model ;Lru/cft/shift/quickstart_bus_traffic/entity/BusModelEntity; 
passengers Ljava/util/HashSet; 	Signature QLjava/util/HashSet<Lru/cft/shift/quickstart_bus_traffic/entity/PassengerEntity;>; <init> ()V Code LineNumberTable LocalVariableTable this 6Lru/cft/shift/quickstart_bus_traffic/entity/BusEntity; getId ()Ljava/lang/Long; setId (Ljava/lang/Long;)V MethodParameters 	getNumber ()Ljava/lang/String; 	setNumber (Ljava/lang/String;)V getModel =()Lru/cft/shift/quickstart_bus_traffic/entity/BusModelEntity; setModel >(Lru/cft/shift/quickstart_bus_traffic/entity/BusModelEntity;)V 
getPassengers ()Ljava/util/HashSet; S()Ljava/util/HashSet<Lru/cft/shift/quickstart_bus_traffic/entity/PassengerEntity;>; 
setPassengers (Ljava/util/HashSet;)V LocalVariableTypeTable T(Ljava/util/HashSet<Lru/cft/shift/quickstart_bus_traffic/entity/PassengerEntity;>;)V equals (Ljava/lang/Object;)Z o Ljava/lang/Object; 	busEntity 
StackMapTable L hashCode ()I toString 
SourceFile BusEntity.java           Z [ 4ru/cft/shift/quickstart_bus_traffic/entity/BusEntity \ : ] java/lang/Object ^ _ java/lang/StringBuilder 
BusEntity{id= ` a ` b 
, number=' ` c , model= 
, passengers= C , getClass ()Ljava/lang/Class; java/util/Objects '(Ljava/lang/Object;Ljava/lang/Object;)Z hash ([Ljava/lang/Object;)I append -(Ljava/lang/String;)Ljava/lang/StringBuilder; -(Ljava/lang/Object;)Ljava/lang/StringBuilder; (C)Ljava/lang/StringBuilder; !  	                                  !   /     *� �    "        #        $ %    & '  !   /     *� �    "       
 #        $ %    ( )  !   >     *+� �    "   
       #        $ %         *        + ,  !   /     *� �    "        #        $ %    - .  !   >     *+� �    "   
       #        $ %         *        / 0  !   /     *� �    "        #        $ %    1 2  !   >     *+� �    "   
    !  " #        $ %         *        3 4  !   /     *� �    "       % #        $ %       5  6 7  !   P     *+� �    "   
    )  * #        $ %         8           *           9  : ;  !   �     [*+� �+� *� +� � �+� M*� ,� � � 1*� ,� � � #*� ,� � � *� ,� � � � �    "   "    .  /  0  1 3 2 A 3 O 4 Z 1 #        [ $ %     [ < =   > > %  ?   
 � @ @@ *    <    A B  !   N     $� 	Y*� SY*� SY*� SY*� S� 
�    "       9 #       $ $ %    C ,  !   o     E� Y� 
� *� � � *� � '� � *� � � *� � }� � �    "       > #       E $ %    D    E
