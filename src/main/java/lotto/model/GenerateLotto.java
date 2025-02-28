package lotto.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static lotto.constant.Constant.*;

public class GenerateLotto {
    private List<List<Integer>> machineNumber;

    public GenerateLotto(){
        this.machineNumber = new ArrayList<>();
    }

    //로또 번호 만들기
    public void generateLottoNumber(int ticket){
        while(ticket-- > 0){
            List<Integer> numbers = Randoms.pickUniqueNumbersInRange(START_NUMBER, END_NUMBER, LOTTO_AMOUNT);
            List<Integer> mutableNumbers = new ArrayList<>(numbers);
            Collections.sort(mutableNumbers);
            this.machineNumber.add(mutableNumbers);
        }
    }

    public List<List<Integer>> getMachineNumber(){
        return this.machineNumber;
    }
}
