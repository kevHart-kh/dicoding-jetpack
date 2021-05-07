package com.kh.filmku.utils

import com.kh.filmku.data.MovieEntity
import com.kh.filmku.data.TvShowEntity

object DataDummy {

    fun generateDummyMovies(): List<MovieEntity> {
        val movie = ArrayList<MovieEntity>()

        movie.add(
            MovieEntity(
                "0",
                "A Star Is Born",
                "Drama, Romance, Music",
                "2018",
                "75%",
                "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
                "2h 16m",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/wrFpXMNBRj2PBiN4Z5kix51XaIZ.jpg")
        )

        movie.add(
            MovieEntity(
                "0",
                "Godzilla vs. Kong",
                "Action, Science Fiction",
                "2021",
                "83%",
                "In a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages.",
                "1h 53m",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/pgqgaUx1cJb5oZQQ5v0tNARCeBp.jpg")
        )

        movie.add(
            MovieEntity(
                "0",
                "Zack Snyder's Justice League",
                "Action, Adventure, Fantasy, Science Fiction",
                "2021",
                "85%",
                "Determined to ensure Superman's ultimate sacrifice was not in vain, Bruce Wayne aligns forces with Diana Prince with plans to recruit a team of metahumans to protect the world from an approaching threat of catastrophic proportions.",
                "4h 2m",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/tnAuB8q5vv7Ax9UAEje5Xi4BXik.jpg")
        )

        movie.add(
            MovieEntity(
                "0",
                "Tom & Jerry",
                "Comedy, Family, Animation",
                "2021",
                "73%",
                "Tom the cat and Jerry the mouse get kicked out of their home and relocate to a fancy New York hotel, where a scrappy employee named Kayla will lose her job if she can’t evict Jerry before a high-class wedding at the hotel. Her solution? Hiring Tom to get rid of the pesky mouse.",
                "2h 16m",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6KErczPBROQty7QoIsaa6wJYXZi.jpg")
        )

        movie.add(
            MovieEntity(
                "0",
                "The Shawshank Redemption",
                "Drama, Crime",
                "1994",
                "87%",
                "Framed in the 1940s for the double murder of his wife and her lover, upstanding banker Andy Dufresne begins a new life at the Shawshank prison, where he puts his accounting skills to work for an amoral warden. During his long stretch in prison, Dufresne comes to be admired by the other inmates -- including an older prisoner named Red -- for his integrity and unquenchable sense of hope.",
                "2h 22m",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/q6y0Go1tsGEsmtFryDOJo3dEmqu.jpg")
        )

        movie.add(
            MovieEntity(
                "0",
                "Thunder Force",
                "Action, Adventure, Comedy, Fantasy",
                "2021",
                "58%",
                "In a world where supervillains are commonplace, two estranged childhood best friends reunite after one devises a treatment that gives them powers to protect their city.",
                "1h 47m",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/279yOM4OQREL36B3SECnRxoB4MZ.jpg")
        )

        movie.add(
            MovieEntity(
                "0",
                "Monster Hunter",
                "Fantasy, Action, Adventure",
                "2020",
                "71%",
                "A portal transports Cpt. Artemis and an elite unit of soldiers to a strange world where powerful monsters rule with deadly ferocity. Faced with relentless danger, the team encounters a mysterious hunter who may be their only hope to find a way home.",
                "1h 44m",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/1UCOF11QCw8kcqvce8LKOO6pimh.jpg")
        )

        movie.add(
            MovieEntity(
                "0",
                "Twist",
                "Crime, Drama, Action",
                "2021",
                "71%",
                "A Dicken’s classic brought thrillingly up to date in the teeming heartland of modern London, where a group of street smart young hustlers plan the heist of the century for the ultimate payday.",
                "1h 30m",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/29dCusd9PwHrbDqzxNG35WcpZpS.jpg")
        )

        movie.add(
            MovieEntity(
                "0",
                "Cherry",
                "Crime, Drama",
                "2021",
                "76%",
                "Cherry drifts from college dropout to army medic in Iraq - anchored only by his true love, Emily. But after returning from the war with PTSD, his life spirals into drugs and crime as he struggles to find his place in the world.",
                "2h 20m",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/pwDvkDyaHEU9V7cApQhbcSJMG1w.jpg")
        )

        movie.add(
            MovieEntity(
                "0",
                "Below Zero",
                "Action, Crime, Thriller",
                "2021",
                "64%",
                "When a prisoner transfer van is attacked, the cop in charge must fight those inside and outside while dealing with a silent foe: the icy temperatures.",
                "1h 46m",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/dWSnsAGTfc8U27bWsy2RfwZs0Bs.jpg")
        )

        movie.add(
            MovieEntity(
                "0",
                "Minari",
                "Drama",
                "2021",
                "77%",
                "A Korean-American family moves to Arkansas in search of their own American Dream. With the arrival of their sly, foul-mouthed, but incredibly loving grandmother, the stability of their relationships is challenged even more in this new life in the rugged Ozarks, testing the undeniable resilience of family and what really makes a home.",
                "1h 55m",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6mPNdmjdbVKPITv3LLCmQoKs9Zw.jpg")
        )

        return movie
    }

    fun generateDummyTvShows(): List<TvShowEntity> {
        val tvShow = ArrayList<TvShowEntity>()

        tvShow.add(
            TvShowEntity("The Good Doctor",
            "2017",
            "86%",
            "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives",
            "43m",
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6tfT03sGp9k4c0J3dypjrI8TSAI.jpg")
        )

        tvShow.add(
            TvShowEntity("9-1-1",
            "2018",
            "81%",
            "Explore the high-pressure experiences of police officers, paramedics and firefighters who are thrust into the most frightening, shocking and heart-stopping situations. These emergency responders must try to balance saving those who are at their most vulnerable with solving the problems in their own lives.",
            "45m",
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/wP9Ho6PCmmrFHLK1VjSAwZKVKtX.jpg")
        )

        tvShow.add(
            TvShowEntity("Case Closed",
            "1996",
            "77%",
            "The son of a world famous mystery writer, Jimmy Kudo, has achieved his own notoriety by assisting the local police as a student detective. He has always been able to solve the most difficult of criminal cases using his wits and power of reason.",
            "25m",
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/9ve6LW4ltMMpp9WjoR4MGViOp9V.jpg")
        )

        tvShow.add(
            TvShowEntity("EastEnders",
            "1985",
            "38%",
            "The everyday lives of working-class residents of Albert Square, a traditional Victorian square of terrace houses surrounding a park in the East End of London's Walford borough.",
            "30m",
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/z4jgyI5TpoRZiJTNchkVkMrGQyz.jpg")
        )

        tvShow.add(
            TvShowEntity("The Good Doctor",
                "2017",
                "86%",
                "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives",
                "43m",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6tfT03sGp9k4c0J3dypjrI8TSAI.jpg")
        )

        tvShow.add(
            TvShowEntity("The Blacklist",
                "2013",
                "74%",
                "Raymond \"Red\" Reddington, one of the FBI's most wanted fugitives, surrenders in person at FBI Headquarters in Washington, D.C. He claims that he and the FBI have the same interests: bringing down dangerous criminals and terrorists. In the last two decades, he's made a list of criminals and terrorists that matter the most but the FBI cannot find because it does not know they exist. Reddington calls this \"The Blacklist\". Reddington will co-operate, but insists that he will speak only to Elizabeth Keen, a rookie FBI profiler.",
                "43m",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/htJzeRcYI2ewMm4PTrg98UMXShe.jpg")
        )

        tvShow.add(
            TvShowEntity("Young Sheldon",
                "2017",
                "80%",
                "The early life of child genius Sheldon Cooper, later seen in The Big Bang Theory.",
                "22m",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/aESxB2HblKlDzma39xVefa20pbW.jpg")
        )

        tvShow.add(
            TvShowEntity("New Amsterdam",
                "2018",
                "84%",
                "Dr. Max Goodwin, the hospital's newest medical director, sets out to tear up the bureaucracy and provide exceptional care.",
                "30m",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/wKTAz8fkoXJoHqPpi4ArAUGDtco.jpg")
        )

        tvShow.add(
            TvShowEntity("NCIS",
                "2003",
                "74%",
                "From murder and espionage to terrorism and stolen submarines, a team of special agents investigates any crime that has a shred of evidence connected to Navy and Marine Corps personnel, regardless of rank or position.",
                "45m",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/fi8EvaWtL5CvoielOjjVvTr7ux3.jpg")
        )

        tvShow.add(
            TvShowEntity("SEAL Team",
                "2017",
                "78%",
                "The lives of the elite Navy Seals as they train, plan and execute the most dangerous, high-stakes missions our country can ask.",
                "43m",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/uTSLeQTeHevt4fplegmQ6bOnE0Z.jpg")
        )

        tvShow.add(
            TvShowEntity("Chicago Fire",
                "2012",
                "84%",
                "An edge-of-your-seat view into the lives of everyday heroes committed to one of America's noblest professions. For the firefighters, rescue squad and paramedics of Chicago Firehouse 51, no occupation is more stressful or dangerous, yet so rewarding and exhilarating. These courageous men and women are among the elite who forge headfirst into danger when everyone else is running the other way and whose actions make the difference between life and death.",
                "42m",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6AccYL0eb7uzHn98IKaNjvJbyuA.jpg")
        )

        return tvShow
    }
}