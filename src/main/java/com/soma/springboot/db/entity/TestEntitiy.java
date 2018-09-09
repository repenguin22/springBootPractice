package com.soma.springboot.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * これはEntityクラスです　これはDBのモデルを表します
 * @author soma
 *
 */
// Entityクラスを表す
@Entity
// DBのテーブル名と対応するもの
// 特に指定しない場合はEntity名と同一になる
@Table(name="test")
public class TestEntitiy {
	
	// Primary Key
	@Id
	// AutoIncrement
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "name")
	private String name;
}
