package com.example.IDL_Allocation_Forming.Main;

import java.io.File;
import java.util.List;

import com.example.IDL_Allocation_Forming.FINAL.SYSTEM_FINAL_ELEMENT;
import com.example.IDL_Allocation_Forming.common.IDL_Allocation_FormingCommon;
import com.example.IDL_Allocation_Forming.common.OSModeLisner;

/**
 * 処理のメインクラス
 * 
 * @author yukishi
 *
 */
public class IDL_Allocation_Forming_Main {
	/**
	 * フォルダから取得したファイルのlist
	 */
	List<File> fileList;
	/**
	 * 起動時にOSを確認するインスタンス
	 */
	OSModeLisner lisner;

	/**
	 * デフォルトコンストラクタ<br>
	 * システム上では使用しない
	 */
	public IDL_Allocation_Forming_Main() {
		this.lisner = new OSModeLisner();
	}

	/**
	 * Apiのメインのメソッド<br>
	 * プロジェクト上は、ApiAppliacationが一番最初によばれるがこちらのクラスに処理を記述していく
	 */
	public void mainRun() {
		// 内部変数宣言
		File folder = new File("");
		int OSno = 0;
		OSno = lisner.userLiten();
		System.out.println("処理が正常。");
		// 開始ログ
		IDL_Allocation_FormingCommon.printlog(SYSTEM_FINAL_ELEMENT.START);
		// パス成形
		String subjectPath = IDL_Allocation_FormingCommon.moldPath(folder);
	}
}
