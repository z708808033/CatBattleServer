package com.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class Demo1 {
	@Test
	public void fun1() throws IOException {
		StringBuilder sb = new StringBuilder();
		String url = "https://battlecats-db.com/enemy/atr_all.html";
		Document document = Jsoup.connect(url).timeout(10000).get();
		Element element = document.select("tbody").get(0);
		Elements Elements = element.select("tr > td");
		for (int i = 0; i < Elements.size(); i += 4) {
			String text = Elements.get(i).text();
			sb.append("\"" + text + "\",");
		}
		System.out.println(sb);
	}
	
	@Test
	public void fun2() throws IOException {
		for (int i = 100; i <= 314; i++) {
			System.out.print("\"0" + i + "\",");
		}
	}
}
