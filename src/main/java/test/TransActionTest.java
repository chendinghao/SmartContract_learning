package test;

import java.math.BigDecimal;
import java.util.concurrent.ExecutionException;

import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.exceptions.TransactionTimeoutException;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.Transfer;
import org.web3j.utils.Convert;

public class TransActionTest {
	public static void main(String[] args) throws Exception
	{
		Web3j web3 = Web3j.build(new HttpService());  // defaults to http://localhost:8545/
		Credentials credentials = WalletUtils.loadCredentials("123456", "F:\\private chain\\geth\\geth-win64\\chain\\keystore\\UTC--2017-04-30T05-11-14.101002000Z--ad13687b7dc5d830367af87ef9a338a9de1c644a");
		Transfer.sendFunds(web3, credentials, "0x8A887FDDb4c904C8f30611107e0605f23F7B6Fb8", BigDecimal.valueOf(666.0), Convert.Unit.ETHER);
	}
}
