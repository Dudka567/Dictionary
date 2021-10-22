package MyPack;
import java.util.Arrays;

public class Dictionary {
    private ElemDictionary[] keys;
    private ElemDictionary[] values;
    private int sizeDictionary;
    private int counterMas;

    public Dictionary(int sizeDictionary){
        this.sizeDictionary = sizeDictionary;
        keys = new ElemDictionary[this.sizeDictionary];
        values = new ElemDictionary[this.sizeDictionary];
        counterMas = 0;
    }

    public void remove(String key){
        for(int i = 0;i<counterMas;i++){
            if(keys[i].nameElem.equals(key)) {
                swapElemsAfterRemove(i);
            }
        }
        counterMas--;
    }

    public void swapElemsAfterRemove(int numberRemoveElem){
        for(int i = numberRemoveElem; i < counterMas-1;i++){
            keys[i] = keys[i+1];
            values[i] = values[i+1];
        }
    }

    public int length(){
        return counterMas;
    }

    public void put(String key, String value)
    {
        if(checkElem(key)) System.out.println("Такой ключ уже есть");
        else {
            ElemDictionary tempKey = new ElemDictionary(key);
            ElemDictionary tempValue = new ElemDictionary(value);
            tempKey.setLink(tempValue);
            tempValue.setLink(tempKey);

            if(counterMas == keys.length) {
                    ElemDictionary[] tempKeys = new ElemDictionary[counterMas*2];
                    tempKeys = Arrays.copyOf(keys,counterMas*2);
                    keys = tempKeys;

                    ElemDictionary[] tempValues = new ElemDictionary[counterMas*2];
                    tempValues = Arrays.copyOf(values,counterMas*2);
                    values = tempValues;
            }

            keys[counterMas] = tempKey;
            values[counterMas] = tempValue;
            counterMas++;
        }
    }

    public void getValue(String key){
        boolean isHave = false;
        for(int i = 0;i<counterMas;i++) {
            if(keys[i].nameElem.equals(key)) { System.out.println(keys[i].link.nameElem);isHave = true; }
        }
        if(!isHave) System.out.println("Ключ отсутствует в словаре");
    }

    public void getKey(String value){
        boolean isHave = false;
        for(int i = 0;i<counterMas;i++){
            if(values[i].nameElem.equals(value)) { System.out.println(values[i].link.nameElem);isHave = true; }
        }
        if(!isHave) System.out.println("Значение отсутствует в словаре");
    }

    public void showKeys() {
        for(int i = 0;i<counterMas;i++)
            System.out.println(keys[i].getNameElem());
    }

    public void showValues() {
        for(int i = 0;i<counterMas;i++)
            System.out.println(values[i].getNameElem());
    }

    public int size() {
        return keys.length;
    }

    protected boolean checkElem(String checkKey) {
        if(sizeDictionary>0) {
            for(int i = 0;i<counterMas;i++){
                    if (keys[i].getNameElem().equals(checkKey)) return true;
            }
            return false;
        }
        else return false;
    }

    private class ElemDictionary{
        protected String nameElem;
        protected ElemDictionary link;

        public ElemDictionary(String nameElem){
            this.nameElem = nameElem;
        }

        public void setNameElem(String nameElem) {
            this.nameElem = nameElem;
        }

        public void setLink(ElemDictionary link) {
            this.link = link;
        }

        public String getNameElem() {
            return nameElem;
        }

        public ElemDictionary getLink() {
            return link;
        }
    }

}
