import java.util.ArrayList;
public class Question {
	public class SoruBilgisi{
		private String soru;
		private String ans_a;
		private String ans_b;
		private String ans_c;
		private String ans_d;
		public SoruBilgisi(String soru, String ans_a, String ans_b, String ans_c, String ans_d) {
			this.soru=soru;
			this.ans_a=ans_a;
			this.ans_b=ans_b;
			this.ans_c=ans_c;
			this.ans_d=ans_d;
			
		}
		public String soruNe() {
			return soru;
		}
		public String chA() {
			return ans_a;
		}
		public String chB() {
			return ans_b;
		}
		public String chC() {
			return ans_c;
		}
		public String chD() {
			return ans_d;
		}
		
	}
		public  String snd_qstn (int n) {
			SoruBilgisi sb1 = new SoruBilgisi("Asagidaki ortamlardan hangisinde bulunmak isterdin ?","Orman","Sahil","Ev","Dag");
			 SoruBilgisi sb2 = new SoruBilgisi("Asagidakilerden hangisi ilgini daha cok ceker ?","Kitap","Gondol","TV","Ucak");
			 SoruBilgisi sb3 = new SoruBilgisi("Moralini asagidaki puan araliklarindan hangisiyle tanimlarsin ?","7-9","4-6","1-3","10");
			 SoruBilgisi sb4 = new SoruBilgisi("Asagidaki kisi veya kisilerden hangisiyle daha iyi vakit gecirirsin ?","Tek Basýna","Arkadaslarinla","Ailenle","Sevgilinle");
			 SoruBilgisi sb5 = new SoruBilgisi("Asagidaki özelliklerden hangisi sende daha baskin ?","Sakin","Enerjik","Sinirli","Aceleci");
			ArrayList<SoruBilgisi> qst = new ArrayList<SoruBilgisi>();
			qst.add(sb1);
			qst.add(sb2);
			qst.add(sb3);
			qst.add(sb4);
			qst.add(sb5);
			return qst.get(n).soruNe();
			}
		public String snd_ans_a(int n) {
			SoruBilgisi sb1 = new SoruBilgisi("Asagidaki ortamlardan hangisinde bulunmak isterdin ?","Orman","Sahil","Ev","Dag");
			 SoruBilgisi sb2 = new SoruBilgisi("Asagidakilerden hangisi ilgini daha cok ceker ?","TV","Gondol","Kitap","Ucak");
			 SoruBilgisi sb3 = new SoruBilgisi("Moralini asagidaki puan araliklarindan hangisiyle tanimlarsin ?","1-3","4-6","7-9","10");
			 SoruBilgisi sb4 = new SoruBilgisi("Asagidaki kisi veya kisilerden hangisiyle daha iyi vakit gecirirsin ?","Tek Basýna","Sevgilinle","Ailenle","Arkadaslarinla");
			 SoruBilgisi sb5 = new SoruBilgisi("Asagidaki özelliklerden hangisi sende daha baskin ?","Sakin","Enerjik","Sinirli","Aceleci");
			ArrayList<SoruBilgisi> qst = new ArrayList<SoruBilgisi>();
			qst.add(sb1);
			qst.add(sb2);
			qst.add(sb3);
			qst.add(sb4);
			qst.add(sb5);
			return qst.get(n).chA();
			}
		public String snd_ans_b(int n) {
			SoruBilgisi sb1 = new SoruBilgisi("Asagidaki ortamlardan hangisinde bulunmak isterdin ?","Orman","Sahil","Ev","Dag");
			 SoruBilgisi sb2 = new SoruBilgisi("Asagidakilerden hangisi ilgini daha cok ceker ?","TV","Gondol","Kitap","Ucak");
			 SoruBilgisi sb3 = new SoruBilgisi("Moralini asagidaki puan araliklarindan hangisiyle tanimlarsin ?","1-3","4-6","7-9","10");
			 SoruBilgisi sb4 = new SoruBilgisi("Asagidaki kisi veya kisilerden hangisiyle daha iyi vakit gecirirsin ?","Tek Basýna","Sevgilinle","Ailenle","Arkadaslarinla");
			 SoruBilgisi sb5 = new SoruBilgisi("Asagidaki özelliklerden hangisi sende daha baskin ?","Sakin","Enerjik","Sinirli","Aceleci");
			ArrayList<SoruBilgisi> qst = new ArrayList<SoruBilgisi>();
			qst.add(sb1);
			qst.add(sb2);
			qst.add(sb3);
			qst.add(sb4);
			qst.add(sb5);
			return qst.get(n).chB();
			}
		public String snd_ans_c(int n) {
			SoruBilgisi sb1 = new SoruBilgisi("Asagidaki ortamlardan hangisinde bulunmak isterdin ?","Orman","Sahil","Ev","Dag");
			 SoruBilgisi sb2 = new SoruBilgisi("Asagidakilerden hangisi ilgini daha cok ceker ?","TV","Gondol","Kitap","Ucak");
			 SoruBilgisi sb3 = new SoruBilgisi("Moralini asagidaki puan araliklarindan hangisiyle tanimlarsin ?","1-3","4-6","7-9","10");
			 SoruBilgisi sb4 = new SoruBilgisi("Asagidaki kisi veya kisilerden hangisiyle daha iyi vakit gecirirsin ?","Tek Basýna","Sevgilinle","Ailenle","Arkadaslarinla");
			 SoruBilgisi sb5 = new SoruBilgisi("Asagidaki özelliklerden hangisi sende daha baskin ?","Sakin","Enerjik","Sinirli","Aceleci");
			ArrayList<SoruBilgisi> qst = new ArrayList<SoruBilgisi>();
			qst.add(sb1);
			qst.add(sb2);
			qst.add(sb3);
			qst.add(sb4);
			qst.add(sb5);
			return qst.get(n).chC();
			}
		public String snd_ans_d(int n) {
			SoruBilgisi sb1 = new SoruBilgisi("Asagidaki ortamlardan hangisinde bulunmak isterdin ?","Orman","Sahil","Ev","Dag");
			 SoruBilgisi sb2 = new SoruBilgisi("Asagidakilerden hangisi ilgini daha cok ceker ?","TV","Gondol","Kitap","Ucak");
			 SoruBilgisi sb3 = new SoruBilgisi("Moralini asagidaki puan araliklarindan hangisiyle tanimlarsin ?","1-3","4-6","7-9","10");
			 SoruBilgisi sb4 = new SoruBilgisi("Asagidaki kisi veya kisilerden hangisiyle daha iyi vakit gecirirsin ?","Tek Basýna","Sevgilinle","Ailenle","Arkadaslarinla");
			 SoruBilgisi sb5 = new SoruBilgisi("Asagidaki özelliklerden hangisi sende daha baskin ?","Sakin","Enerjik","Sinirli","Aceleci");
			ArrayList<SoruBilgisi> qst = new ArrayList<SoruBilgisi>();
			qst.add(sb1);
			qst.add(sb2);
			qst.add(sb3);
			qst.add(sb4);
			qst.add(sb5);
			return qst.get(n).chD();
			}
}
