
import Link from "next/link";
const MyApp = ({ Component, pageProps }) => {
    return (
           <>
        

        <Link href="/">Home</Link>
           
            <Link href="/about">AboutUs</Link>
            <Component {...pageProps} />
            <footer>Designed By SINGH</footer>
        </>
    );
};

export default MyApp;