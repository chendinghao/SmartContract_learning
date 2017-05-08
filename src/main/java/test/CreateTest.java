package test;

import java.io.File;

import org.web3j.crypto.WalletUtils;

public class CreateTest {
	private static String password = "123456";
	private static String path = "F:\\private chain\\geth\\geth-win64\\chain\\keystore";
	
	public static void main(String[] args) throws Exception
	{
		String fileName = WalletUtils.generateFullNewWalletFile(password, new File(path));
		System.out.println(fileName);
	}
}
