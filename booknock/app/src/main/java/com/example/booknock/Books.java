package com.example.booknock;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Books extends AppCompatActivity {
    ArrayList<AllBooks> bookslist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);



        AllBooks book1 = new AllBooks("the midnight library","Matt Haig",R.drawable.themidnight,"The book's protagonist is a young woman named Nora Seed who is unhappy with her choices in life. During the night, she tries to kill herself but ends up in a library managed by her school librarian, Mrs. Elm. The library is between life and death with millions of books filled with stories of her life had she made some decisions differently. In this library, she then tries to find the life in which she's the most content.[3] For example, one possible life in which she tries to reunite with her boyfriend and finds herself married to him, but it isn't the way as she expected. She also sees herself as a glaciologist doing research in the Svalbard archipelago in the Arctic – a very different life from the one she tries to escape, but not necessarily a better choice.");
        AllBooks book2 = new AllBooks("the inheritance games","Jennifer Lynn Barnes",R.drawable.theinhertance,"Avery Grambs has a plan for a better future: survive high school, win a scholarship, and get out. But her fortunes change in an instant when billionaire Tobias Hawthorne dies and leaves Avery virtually his entire fortune. The catch? Avery has no idea why--or even who Tobias Hawthorne is. To receive her inheritance, Avery must move into sprawling, secret passage-filled Hawthorne House, where every room bears the old man's touch--and his love of puzzles, riddles, and codes.");
        AllBooks book3 = new AllBooks("1984","George Orwell",R.drawable.ninteen,"ineteen Eighty-Four (also stylised as 1984) is a dystopian social science fiction novel and cautionary tale written by the English writer George Orwell. It was published on 8 June 1949 by Secker & Warburg as Orwell's ninth and final book completed in his lifetime. Thematically, it centres on the consequences of totalitarianism, mass surveillance and repressive regimentation of people and behaviours within society. Orwell, a democratic socialist, modelled the totalitarian government in the novel after Stalinist Russia and Nazi Germany. More broadly, the novel examines the role of truth and facts within politics and the ways in which they are manipulated.");
        AllBooks book4 = new AllBooks("Little Women","Louisa May Allcot",R.drawable.littlewomen,"Louisa May Alcott's semi-autobiographical Little Women, originally published in 1868, is a lengthy, beloved American classic that tells the story of the four March sisters growing up in Boston during and after the Civil War, as they wait for their father to return home.");
        //AllBooks book5 = new AllBooks("The brothers Karamazov","Fyodor Dostoevsky",R.drawable.brothers);
        AllBooks book6 = new AllBooks("We hunt the flame","Hafsah Faisal",R.drawable.wehunt,"Zafira is the Hunter, disguising herself as a man when she braves the cursed forest of the Arz to feed her people. Nasir is the Prince of Death, assassinating those foolish enough to defy his autocratic father, the sultan. If Zafira was exposed as a girl, all of her achievements would be rejected; if Nasir displayed his compassion, his father would punish him in the most brutal of ways. Both Zafira and Nasir are legends in the kingdom of Arawiya--but neither wants to be.\n" +
                "War is brewing, and the Arz sweeps closer with each passing day, engulfing the land in shadow. When Zafira embarks on a quest to uncover a lost artifact that can restore magic to her suffering world and stop the Arz, Nasir is sent by the sultan on a similar mission: retrieve the artifact and kill the Hunter. But an ancient evil stirs as their journey unfolds--and the prize they seek may pose a threat greater than either can imagine.");
        AllBooks book7 = new AllBooks("The Hobbit","J. R. R. Tolkien.",R.drawable.thehobbit,"The Hobbit is set within Tolkien's fictional universe and follows the quest of home-loving Bilbo Baggins, the titular hobbit, to win a share of the treasure guarded by a dragon named Smaug. Bilbo's journey takes him from his light-hearted, rural surroundings into more sinister territory." +
                "The story is told in the form of an episodic quest, and most chapters introduce a specific creature or type of creature of Tolkien's geography. Bilbo gains a new level of maturity, competence, and wisdom by accepting the disreputable, romantic, fey, and adventurous sides of his nature and applying his wits and common sense. The story reaches its climax in the Battle of Five Armies, where many of the characters and creatures from earlier chapters re-emerge to engage in conflict.");
        //AllBooks book8 = new AllBooks("Percy Jackson1","Rick Riordan",R.drawable.percy);
        AllBooks book9 = new AllBooks("The hunger games","Suzanne Collins",R.drawable.thehunger,"in the ruins of a place once known as North America lies the nation of Panem, a shining Capitol surrounded by twelve outlying districts. The Capitol is harsh and cruel and keeps the districts in line by forcing them all to send one boy and one girl between the ages of twelve and eighteen to participate in the annual Hunger Games, a fight to the death on live TV.\n" +
                "Sixteen-year-old Katniss Everdeen, who lives alone with her mother and younger sister, regards it as a death sentence when she steps forward to take her sister's place in the Games. But Katniss has been close to dead before—and survival, for her, is second nature. Without really meaning to, she becomes a contender. But if she is to win, she will have to start making choices that weight survival against humanity and life against love");
        AllBooks book10 = new AllBooks("Hiroshima","John Hersey",R.drawable.hiroshima,"On August 6, 1945, Hiroshima was destroyed by the first atom bomb ever dropped on a city. This book, John Hersey's journalistic masterpiece, tells what happened on that day. Told through the memories of survivors, this timeless, powerful and compassionate document has become a classic that stirs the conscience of humanity(The New York Times).");
        //AllBooks book11 = new AllBooks("the selfish gene","Richard Dawkins",R.drawable.selfishgene);
        //AllBooks book12 = new AllBooks("A moveable feast","Ernest Hemingway",R.drawable.beast);
       // AllBooks book13 = new AllBooks("11,22,63","Stephen King",R.drawable.stephen);
        AllBooks book14 = new AllBooks("gonegirl","Gillian Flynn",R.drawable.gonegirl,"Who are you?" +
                "What have we done to each other?" +
                "" +
                "These are the questions Nick Dunne finds himself asking on the morning of his fifth wedding anniversary when his wife Amy suddenly disappears. The police suspect Nick. Amy's friends reveal that she was afraid of him, that she kept secrets from him. He swears it isn't true. A police examination of his computer shows strange searches. He says they weren't made by him. And then there are the persistent calls on his mobile phone.\n" +
                "" +
                "So what did happen to Nick's beautiful wife?");
        AllBooks book15 = new AllBooks("The girl on the train","Paula Hawkins",R.drawable.onthetrain,"Rachel catches the same commuter train every morning. She knows it will wait at the same signal each time, overlooking a row of back gardens. She’s even started to feel like she knows the people who live in one of the houses. “Jess and Jason,” she calls them. Their life—as she sees it—is perfect. If only Rachel could be that happy. And then she sees something shocking. It’s only a minute until the train moves on, but it’s enough. Now everything’s changed. Now Rachel has a chance to become a part of the lives she’s only watched from afar. Now they’ll see; she’s much more than just the girl on the train...");
        AllBooks book16 = new AllBooks("A Good Girl's Guide to Murder","Holly Jackson",R.drawable.goodgirlguide,"The case is closed. Five years ago, schoolgirl Andie Bell was murdered by Sal Singh. The police know he did it. Everyone in town knows he did it.But having grown up in the same small town that was consumed by the murder, Pippa Fitz-Amobi isn't so sure. When she chooses the case as the topic for her final year project, she starts to uncover secrets that someone in town desperately wants to stay hidden. And if the real killer is still out there, how far will they go to keep Pip from the truth?");
        AllBooks book17 = new AllBooks("ثلاثية غرناطة","رضوى عاشور",R.drawable.tholathya,"لأحداث في مملكة غرناطة بعد سقوط جميع الممالك الإسلامية في الأندلس، و تبدأ أحداث الثلاثية في عام 1491م، وهو العام الذي سقطت فيه غرناطة بإعلان المعاهدة التي تنازل بمقتضاها (أبو عبد الله محمد الصغير) آخر ملوك غرناطة عن ملكه لملكي قشتالة وأراجون، وتنتهى بمخالفة آخر أبطالها الأحياء (عليّ) لقرار ترحيل المسلمين حينما يكتشف أن الموت في الرحيل عن الأندلس و ليس في البقاء");
        AllBooks book18 = new AllBooks("أرض زيكولا","عمرو عبدالحميد",R.drawable.zeekola,"هل جرّبت أن تتعامل بعملة مختلفة عن العملات الورقية .. ليست معدنية وليست ذهبية ...الثروة هنا من نوع آخر ... لن تدفع مالاً لتأخذ ..بل ستدفع من ذكائك ..ستدفع من وحدات عقلك... ولكن انتبه فـ للثروة حدود ...فهنا المفلس لا يعامل باحتقار أو يُهان كما يحدث في عالمك .. بل يتعرض للموت .. احذر .. فأنت .. في أرض زيكولا");
        AllBooks book19 = new AllBooks("بساتين عربستان","أسامة المسلم",R.drawable.basateen,"تعود احداث السلسلة الروائية إلى أيام الجاهلية قبل دخول الإسلام وتتمحور احداثها في ظل الحروب والرغبة في الثأر والإنتقام الذي اشتعل بين ساحرة فارسية تسمى أفسار و وساحرة عربية تدعى دعجاء وتقوم كلا منهما بإستغلال مجموعة ساحرات وتجنيدهن خلال الحرب الدائرة بينهما .");
        AllBooks book20 = new AllBooks("عائد إلى حيفا","غسان كنفاني",R.drawable.backtoh,"جسد حب كنفاني للعودة إلى بلده، فهي تدور بمعظمها في الطريق إلى حيفا عندما يقرر سعيد وزوجته الذهاب إلى هناك، وتفقد بيتهما الذي تركاه وفيه طفل رضيع أثناء معركة حيفا عام 1948. وتعطي الرواية حيزاً كبيراً للمفهوم الذهبي للوطنية والمواطنة وتبين من خلال التداعي قسوة الظروف التي أدت إلى مأساة عائلة سعيد وتطرح مفهوماً مختلفاً عما كان سائداً لمعنى الوطن في الخطاب الفلسطيني.");


        bookslist.add(book1);
        bookslist.add(book2);
        bookslist.add(book3);
        bookslist.add(book4);;
        bookslist.add(book6);
        bookslist.add(book7);
        bookslist.add(book9);
        bookslist.add(book10);
        bookslist.add(book14);
        bookslist.add(book15);
        bookslist.add(book16);
        bookslist.add(book17);
        bookslist.add(book18);
        bookslist.add(book19);
        bookslist.add(book20);


        RecyclerView rv = findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(layoutManager);

        final BooksAdapter adap = new BooksAdapter(bookslist,Books.this);
        rv.setAdapter(adap);




























    }
}